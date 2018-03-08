package week3.les6.opdracht2;

public class Vriend
{
    private String voornaam;
    private String achternaam;
    private String email;
    public Vriend(String voornaam, String achternaam, String email)
    {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vriend vriend = (Vriend) o;

        if (voornaam != null ? !voornaam.equals(vriend.voornaam) : vriend.voornaam != null) return false;
        if (achternaam != null ? !achternaam.equals(vriend.achternaam) : vriend.achternaam != null) return false;
        return email != null ? email.equals(vriend.email) : vriend.email == null;
    }

    @Override
    public String toString() {
        return this.voornaam + " " + this.achternaam + ", email: " + this.email;
    }
}
