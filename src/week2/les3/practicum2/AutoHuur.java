package week2.les3.practicum2;



public class AutoHuur
{
    private int aantalDagen;
    private Auto GehuurdeAuto;
    private Klant Huurder;
    public AutoHuur()
    {
        this.aantalDagen = 0;
        this.GehuurdeAuto = null;
        this.Huurder = null;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public Auto getGehuurdeAuto() {
        return GehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        GehuurdeAuto = gehuurdeAuto;
    }

    public Klant getHuurder() {
        return Huurder;
    }

    public void setHuurder(Klant huurder) {
        Huurder = huurder;
    }

    public double totaalPrijs()
    {
        if(this.aantalDagen==0) return 0;
        return this.aantalDagen * (this.GehuurdeAuto.getPrijsPerDag() * (1.0 - Huurder.getKorting()*0.01));

    }

    @Override
    public String toString() {
        String returnvalue = "";
        if(this.getGehuurdeAuto() != null)
        {
            returnvalue += this.getGehuurdeAuto() + "\n";
        }
        else
        {
            returnvalue += "er is geen auto bekend\n";
        }

        if(this.getHuurder() != null)
        {
            returnvalue += this.getHuurder() + "\n";
        }
        else
        {
            returnvalue += "er is geen huurder bekend\n";
        }
        returnvalue += "aantal dagen: "+this.aantalDagen+" en dat kost " + totaalPrijs();

        return returnvalue;

    }
}
