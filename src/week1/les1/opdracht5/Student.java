package week1.les1.opdracht5;

public class Student {
    private String naam;
    private int studentNummer;
    public Student(String naam)
    {
        this.naam = naam;
        this.studentNummer = 0;
    }
    public Student(String naam, int studentNummer)
    {
        this.naam = naam;
        this.studentNummer = studentNummer;
    }

    public String getNaam() {
        return naam;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    @Override
    public String toString() {
        return "Deze student heet "+this.naam + " en heeft nummer: " + this.studentNummer;
    }
}
