package week4.les7.practicum1;

import java.time.LocalDate;
import java.util.Objects;

public class Auto extends Voertuig
{
    private String kenteken;

    public Auto(String type, double nieuwprijs, int bouwjaar, String kenteken) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kenteken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        Boolean equal = Objects.equals(kenteken, auto.kenteken);
        if(equal && super.equals(o)) return true;
        return false;
    }


    @Override
    public double huidigeWaarde() {
        return Math.pow(0.7, (LocalDate.now().getYear() - bouwjaar)) * nieuwprijs;
    }
}
