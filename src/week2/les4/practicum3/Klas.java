package week2.les4.practicum3;


import java.util.ArrayList;

public class Klas
{
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String klasCode) {
        this.klasCode = klasCode;
        this.leerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling l)
    {
        this.leerlingen.add(l);
    }
    public int aantalLeerlingen()
    {
        return this.leerlingen.size();
    }
    public void wijzigCijfer(String naam, double cijfer)
    {
        for(Leerling l : leerlingen)
        {
            if(l.getNaam().equals(naam))
            {
                l.setCijfer(cijfer);
            }
        }
    }

    @Override
    public String toString() {
        String returnval = "";
        returnval = "In klas "+this.klasCode+" zitten de volgende leerlingen: \n";
        for(Leerling l : this.leerlingen)
        {
            returnval += l;
        }
        return returnval;
    }
}
