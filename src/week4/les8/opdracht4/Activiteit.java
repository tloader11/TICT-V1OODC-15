package week4.les8.opdracht4;

import java.util.Date;

public class Activiteit
{
    private String naam;
    private Date startDate;
    private Date endDate;
    private Medewerker m;

    public Activiteit(String naam, Date startDate, Date endDate, Medewerker m) {
        this.naam = naam;
        this.startDate = startDate;
        this.endDate = endDate;
        this.m = m;
    }
}
