package week3.les6.hotelapp;

import java.time.LocalDate;

/**
 * Created by universal on 3/15/2018.
 */
public class Boeking
{
    private int boekingsnummer;
    private Klant klant;
    private Kamer kamer;
    private LocalDate van;
    private LocalDate tot;

    public Boeking(int boekingsnummer, Klant klant, Kamer kamer, LocalDate van, LocalDate tot) {
        this.boekingsnummer = boekingsnummer;
        this.klant = klant;
        this.kamer = kamer;
        this.van = van;
        this.tot = tot;
    }
}
