package week5.les10.practicum3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{

    public static Object readInput(boolean type) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(type) {
            System.out.print("Enter String: ");
            return br.readLine();
        }
        else {
            System.out.print("Geef dollar in euro: ");
            try {
                Double d = Double.parseDouble(br.readLine());
                return d;
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid Format!");
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String bronbestand = "";
        String bestemming = "";
        Double usd_in_eur = 0.0;

        try {
            bronbestand = (String)readInput(true);
            bestemming = (String)readInput(true);
            usd_in_eur = (Double)readInput(false);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        BufferedReader br = null;
        FileReader fr = null;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(bronbestand);
            br = new BufferedReader(fr);

            String sCurrentLine;
            List<String> newLines = new ArrayList<>();

            while ((sCurrentLine = br.readLine()) != null) {
                Pattern p = Pattern.compile(".*: (.*)");
                Matcher m = p.matcher(sCurrentLine);
                m.find();
                String prijs_oud = m.group(1);
                sCurrentLine=sCurrentLine.replace(prijs_oud, "");
                Double newprice = Double.parseDouble(prijs_oud) * usd_in_eur;
                System.out.println(sCurrentLine + newprice);
                newLines.add(sCurrentLine + newprice);
            }
            PrintWriter pw = new PrintWriter(new FileWriter(bestemming));
            for(String s : newLines)
            {
                pw.write(s+"\r\n");
            }
            pw.close();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }
}
