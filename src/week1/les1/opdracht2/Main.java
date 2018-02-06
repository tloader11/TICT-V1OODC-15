package week1.les1.opdracht2;

public class Main {

    public static void main(String[] args)
    {
        Klant a = new Klant("Jan","Nijenoord 1","Utrecht");
        Klant b = new Klant("Wim", "Oudenoord 340", "Utrecht");
        print("Naam: " + a.getName());
        print("Adres: " + a.getAddress());
        print("Plaats: " + a.getPlaats());

    }
    public static void print(Object var)
    {
        System.out.println(var);
    }
}
