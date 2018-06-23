package week4.les8.opdracht5;

import java.util.ArrayList;
import java.util.List;

public class Sponsorloop
{
    String naam;
    List<Loper> lopers = new ArrayList<>();

    public Sponsorloop(String naam, List<Loper> lopers) {
        this.naam = naam;
        this.lopers = lopers;
    }
}
