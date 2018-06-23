package week5.les10.opdracht1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static final String FILENAME = "invoer.txt";

    public static void main(String[] args) {

        BufferedReader br = null;
        FileReader fr = null;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;
            List<Double> nummers = new ArrayList<>();
            Double gemiddeld = 0.0d;
            while ((sCurrentLine = br.readLine()) != null) {
                nummers.add(Double.parseDouble(sCurrentLine));
                System.out.println(sCurrentLine);
            }
            for(Double d : nummers)
            {
                gemiddeld +=d;
            }
            gemiddeld = gemiddeld / nummers.size();
            System.out.println("Het gemiddelde is: " + gemiddeld);

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
