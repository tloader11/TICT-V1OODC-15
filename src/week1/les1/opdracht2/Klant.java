package week1.les1.opdracht2;

/**
 * Created by universal on 2/6/2018.
 */
public class Klant
{
    private String name;
    private String address;
    private String plaats;
    public Klant(String name, String address, String plaats)
    {
        this.name = name;
        this.address = address;
        this.plaats = plaats;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPlaats() {
        return plaats;
    }
}
