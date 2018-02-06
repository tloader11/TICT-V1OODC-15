package week1.les1.opdracht3;

public class Main {

    public static void main(String[] args)
    {
        Student a = new Student("TestNaam");
        print("Naam: " + a.getNaam());

    }
    public static void print(Object var)
    {
        System.out.println(var);
    }
}
