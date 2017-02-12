package VHackXT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;
import me.checkium.vhackapi.vHackAPI;
import me.checkium.vhackapi.vHackAPIBuilder;
import me.checkium.vhackapi.console.ScannedNode;
import me.checkium.vhackapi.console.TransferResult;
import java.text.*;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConsoleExample {

    public static void main(String[] args) {
        //Create your API instance
        System.out.println("Press 1 for default scan");
        System.out.println("or");
        System.out.println("Press 2 for scheduler scan");
        System.out.println("and then press Enter to start");
        Scanner sc = new Scanner(System.in);
        int choosed = sc.nextInt();
        switch (choosed) {
            case 1:
                System.out.println("Start default scan");
                executeScan();
                break;
            case 2:
                System.out.println("Start scheduler scan");
                executeSchedulerScan();
                break;
            default:
                break;
        }
    }

    public static void executeScan() {
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("=============== HACK " + (i + 1) + " ==================");
                scan();
            }
        } catch (Exception ex) {
            scan();
        }
    }

    public static void executeSchedulerScan() {
        try {
            ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
            ses.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Scan Hour ");
                        scanIP();
                    } catch (Exception ex) {

                    }
                }
            }, 0, 1, TimeUnit.HOURS);
        } catch (Exception ex) {

        }
    }

    public static void scanIP() {

        vHackAPI api = new vHackAPIBuilder().password("pass").username("user").getAPI();
        //Get an IP trougth console
        Path filePath = new File("listip.txt").toPath();
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath);
            for (String ip : lines) {
                ScannedNode scanned = api.getConsole().scanIP(ip);
                if (scanned.getSuccessRate() >= 80) {
                    //if the success rate is bigger or equals 70 then transfer trojan
                    TransferResult transfer = api.getConsole().transferTrojanTo(scanned);
                    Random rand = new Random();
                    int randomNum = rand.nextInt(2000 - 1000) + 500;
                    Thread.sleep(randomNum);
                    if (transfer.getSuccess()) {
                        // if transfer is successfull
                        NumberFormat nf = NumberFormat.getInstance();
                        System.out.println("Got $" + nf.format(transfer.getMoneyAmount()));
                        System.out.println("Gained " + transfer.getRepGained() + " rep.");
                    }
                }
            }

        } catch (Exception ex) {

        }
    }

    public static void scan() {

        vHackAPI api = new vHackAPIBuilder().password("pass").username("user").getAPI();
        //Get an IP trougth console
        ArrayList<String> ips = api.getConsole().getIP(false, false);
        //Scan the IP

        try {
            for (int i = 0; i < ips.size(); i++) {
                ScannedNode scanned = api.getConsole().scanIP(ips.get(i));

                if (scanned.getSuccessRate() >= 70) {
                    //if the success rate is bigger or equals 70 then transfer trojan
                    TransferResult transfer = api.getConsole().transferTrojanTo(scanned);
                    Random rand = new Random();
                    int randomNum = rand.nextInt(2000 - 1000) + 500;
                    Thread.sleep(randomNum);
                    if (transfer.getSuccess()) {
                        // if transfer is successfull
                        NumberFormat nf = NumberFormat.getInstance();
                        System.out.println("Got $" + nf.format(transfer.getMoneyAmount()));
                        System.out.println("Gained " + transfer.getRepGained() + " rep.");
                        if (transfer.getMoneyAmount() > 10000000) {
                            System.out.println("IP " + ips.get(i));
                            writeFile(ips.get(i));
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
            //e.printStackTrace();
        }
    }

    public static void writeFile(String ip) throws IOException {
        File fout = new File("note.txt");
        Path filePath = new File("note.txt").toPath();
        List<String> lines = null;
        lines = Files.readAllLines(filePath);
        if (!fout.exists()) {
            fout.createNewFile();
        }
        FileWriter fw = null;
        fw = new FileWriter(fout.getAbsoluteFile(), true);

        BufferedWriter bw = new BufferedWriter(fw);

        if (!lines.contains(ip)) {
            bw.write(ip);

            bw.newLine();
        }

        bw.close();
    }
}
