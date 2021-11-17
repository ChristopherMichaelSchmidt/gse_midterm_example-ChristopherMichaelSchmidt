package main.java;

import java.util.Objects;

public class Einkauf {
    private String artikelname;
    private double preis;

    public Einkauf(String artikelname, double preis) {
        this.artikelname = artikelname;
        this.preis = preis;
    }

    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }

    public String getArtikelname() {
        return artikelname;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Einkauf einkauf = (Einkauf) o;
        return Double.compare(einkauf.preis, preis) == 0 && Objects.equals(artikelname, einkauf.artikelname);
    }

    @Override
    public String toString() {
        return "Einkauf{" +
                "artikelname='" + artikelname + '\'' +
                ", preis=" + preis +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(artikelname, preis);
    }
}
