package week4.les8.opdracht4;

import java.util.List;

public class Klus
{
    int kluscode;
    String klusnaam;
    List<Activiteit> alleActiviteiten;

    public Klus(int kluscode, String klusnaam, List<Activiteit> alleActiviteiten) {
        this.kluscode = kluscode;
        this.klusnaam = klusnaam;
        this.alleActiviteiten = alleActiviteiten;
    }
}
