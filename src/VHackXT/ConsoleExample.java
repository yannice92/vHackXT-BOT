package VHackXT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;
import me.checkium.vhackapi.vHackAPI;
import me.checkium.vhackapi.vHackAPIBuilder;
import me.checkium.vhackapi.console.ScannedNode;
import me.checkium.vhackapi.console.TransferResult;
import java.text.*;

public class ConsoleExample {

    public static void main(String[] args) {
        //Create your API instance
        for (int i = 0; i < 1000; i++) {
            System.out.println("=============== HACK " + (i + 1) + " ==================");
            scan();
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
        if (!fout.exists()) {
            fout.createNewFile();
        }
        FileWriter fw = null;
        fw = new FileWriter(fout.getAbsoluteFile(), true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(ip);
        bw.newLine();

        bw.close();
    }
}
