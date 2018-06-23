package week4.les8.opdracht5;

public class Loper
{
    private String naam;
    private String phone;
    private String functie;
    private Boolean beschikbaar;

    public Loper(String naam, String phone, String functie, Boolean beschikbaar) {
        this.naam = naam;
        this.phone = phone;
        this.functie = functie;
        this.beschikbaar = beschikbaar;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public Boolean getBeschikbaar() {
        return beschikbaar;
    }

    public void setBeschikbaar(Boolean beschikbaar) {
        this.beschikbaar = beschikbaar;
    }
}
