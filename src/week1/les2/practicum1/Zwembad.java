package week1.les2.practicum1;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    public Zwembad(double width, double length, double depth)
    {
        this.breedte = width;
        this.lengte = length;
        this.diepte = depth;
    }
    public Zwembad()
    {
        this.breedte = 0.0;
        this.lengte = 0.0;
        this.diepte = 0.0;
    }

    public double getBreedte() {
        return this.breedte;
    }

    public double getLengte() {
        return this.lengte;
    }

    public double getDiepte() {
        return this.diepte;
    }
    public double inhoud()
    {
        return this.breedte * this.lengte * this.diepte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is "+this.breedte+" meter breed, "+this.lengte+" meter lang, en "+this.diepte+" meter diep";
    }
}
