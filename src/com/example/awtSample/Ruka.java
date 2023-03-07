package com.example.awtSample;

public class Ruka {
    public enum Stanje { SAVIJENA, ISPRUZENA }

    private Stanje stanje = Stanje.ISPRUZENA;

    public void savij() {
        stanje = Stanje.SAVIJENA;
    }

    public void ispruzi() {
        stanje = Stanje.ISPRUZENA;
    }

    public Stanje getStanje() {
        return this.stanje;
    }

    public boolean jeSavijena() {
        return stanje == Stanje.SAVIJENA;
    }

    public boolean jeIspruzena() {
        return stanje == Stanje.ISPRUZENA;
    }
}
