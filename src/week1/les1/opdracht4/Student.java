package week1.les1.opdracht4;


public class Student {
    private String naam;
    public Student(String naam)
    {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Deze student heet "+this.naam;
    }
}
