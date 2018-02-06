package week1.les2.practicum2;

public class Voetbalclub
{
    String clubnaam;
    int aantalGewonnen = 0;
    int aantalGelijk = 0;
    int aantalVerloren = 0;
    public Voetbalclub(String clubnaam)
    {
        this.clubnaam = clubnaam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    @Override
    public String toString() {
        int puntenWinst = aantalGewonnen * 3;
        int puntenGelijk = aantalGelijk;
        int puntenVerloren = 0;
        int totaal = puntenWinst + puntenGelijk + puntenVerloren;
        int wedstrijden = aantalGelijk + aantalGewonnen + aantalVerloren;
        return clubnaam + "   " + wedstrijden + "      " + aantalGewonnen + "  " + aantalGelijk + "    " + totaal;
    }
}
