package week4.les7.practicum1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by Tristan on 3/22/2018.
 */
public class Computer implements Goed {

    String type;
    String MacAdres;
    double aanschafPrijs;
    int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
        this.type = type;
        MacAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }

    @Override
    public double huidigeWaarde() {
        return 0.6 * (LocalDate.now().getYear() - productieJaar) * aanschafPrijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.aanschafPrijs, aanschafPrijs) == 0 &&
                productieJaar == computer.productieJaar &&
                Objects.equals(type, computer.type) &&
                Objects.equals(MacAdres, computer.MacAdres);
    }

    @Override
    public String toString() {
        return "Computer: " + type + '\'' +
                " heeft een waarde van: " + this.huidigeWaarde() + "\r\n";
    }
}
