package week2.les4.opdracht3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static String getInput()
    {
        Scanner scanner = new Scanner(System.in); //scanner koppelen aan toetsenbord
        System.out.print("Voer getal vanaf 10 in: ");
        String getal = scanner.nextLine(); // scanner wacht op invoer + enter
        //scanner.close(); // scanner afsluiten na gebruik
        return getal;
    }

    public static void main(String[] args)
    {
        Character[] getallen = {'1','2','3','4','5','6','7','8','9','0'};
        int getal = -1;
        ArrayList<Integer> ingevoerde_getallen = new ArrayList<Integer>();
        while(getal != 0)
        {
            String potentieel_getal = getInput();
            if (potentieel_getal.length() == 2 && Arrays.asList(getallen).contains(potentieel_getal.charAt(0)) && Arrays.asList(getallen).contains(potentieel_getal.charAt(1)))
            {
                getal = Integer.parseInt(potentieel_getal);
                if(getal >= 10)
                {
                    ingevoerde_getallen.add(getal);
                }
            }
            else if(potentieel_getal.length() == 1 && potentieel_getal.equals("0"))
            {
                getal = 0;
            }
        }
        int totaal = 0;
        for(int i : ingevoerde_getallen)
        {
            System.out.println(i);
            totaal +=i;
        }
        System.out.println("Gemiddelde: " + totaal/ingevoerde_getallen.size());
    }
}
