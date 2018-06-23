package week5.les9.practicum0;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314,1));
    }
}
class Utils
{
    public static String euroBedrag(double bedrag)
    {
        return euroBedrag(bedrag,2);
    }
    public static String euroBedrag(double bedrag, int precisie)
    {
        Double b = Math.round(bedrag * Math.pow(10.0, precisie)) / Math.pow(10.0, precisie);
        return "€ "+b.toString();
    }
}
