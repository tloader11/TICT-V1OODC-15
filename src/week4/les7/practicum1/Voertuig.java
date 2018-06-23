package week4.les7.practicum1;

import java.util.Objects;

abstract class Voertuig implements Goed
{
    String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar) {
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(voertuig.nieuwprijs, nieuwprijs) == 0 &&
                bouwjaar == voertuig.bouwjaar &&
                Objects.equals(type, voertuig.type);
    }

    @Override
    public String toString() {
            return "Voertuig: " + type + '\'' +
                " met bouwjaar " + bouwjaar +
                " heeft een waarde van: " + this.huidigeWaarde() + "\r\n";

    }
}
