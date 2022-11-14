import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Th2 implements Runnable {
    @Override
    public void run() {
        fucn2();
    }

    private void fucn2() {
        String sourceName = "CCrec.csv";
        String destname="tmp_" + sourceName;
        try {//from w  ww  .  j a v  a2s .  com
            Path source = FileSystems.getDefault().getPath(sourceName);
            Path temp = FileSystems.getDefault().getPath(destname);

            // Create input stream
            FileReader fr = new FileReader(source.toFile());
            BufferedReader in = new BufferedReader(fr);

            // Create output stream
            FileWriter fw = new FileWriter(temp.toFile());
            BufferedWriter out = new BufferedWriter(fw);

            boolean eof = false;
            int inChar;
            do {
                inChar = in.read();
                if (inChar != -1) {
                    char outChar = Character.toUpperCase((char) inChar);
                    out.write(outChar);
                } else
                    eof = true;
            } while (!eof);
            in.close();
            out.close();
        } catch (IOException | SecurityException se) {
            System.out.println("Error -- " + se.toString());
        }

        try {
            File myObj = new File(destname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
