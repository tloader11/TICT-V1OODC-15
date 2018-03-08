package week3.les6.opdracht2;


import java.util.ArrayList;

public class FacebookAccount
{
    private String naam;
    private ArrayList<Vriend> vrienden;

    public FacebookAccount(String naam) {
        this.naam = naam;
        vrienden = new ArrayList<Vriend>();
    }

    public String getNaam() {
        return naam;
    }

    public int aantalVrienden()
    {
        return vrienden.size();
    }

    public void voegVriendToe(Vriend v)
    {
        if(!vrienden.contains(v))
            vrienden.add(v);
    }

    public boolean verwijderVriend(Vriend v)
    {
        return vrienden.remove(v);
    }

    public boolean isVriendMet(Vriend v)
    {
        for(Vriend x : vrienden)
        {
            if(x.equals(v)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String returnstring = "";
        returnstring += this.naam + " heeft "+this.aantalVrienden()+" vrienden: \n";
        for(Vriend v : this.vrienden)
        {
            returnstring = returnstring + v + '\n';
        }
        return returnstring;
    }
}
