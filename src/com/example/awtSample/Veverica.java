package com.example.awtSample;

public class Veverica {

    private String ime;
    private String boja;
    private Ruka levaRuka;
    private Ruka desnaRuka;
    private String staDrzi;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Veverica(String ime, String boja) {
        this.setIme(ime);
        this.setBoja(boja);
        this.levaRuka = new Ruka();
        this.desnaRuka = new Ruka();
        this.staDrzi = "NISTA";
    }

    public String getIme() {
        return ime;
    }

    public String getBoja() {
        return boja;
    }

    public String getStaDrzi() {
        return staDrzi;
    }

    public void savijLevuRuku() {
        levaRuka.savij();
        System.out.println(ime + ": je savila levu ruku.");
    }
    public void savijDesnuRuku() {
        desnaRuka.savij();
        System.out.println(ime + ": je savila desnu ruku.");
    }

    public void proveriDaLiMozeDaDrziNesto(Ruka ruka) {
        if (ruka.jeIspruzena()) {
            System.out.println(ime + ": je ispustila " + staDrzi);
            staDrzi = "NISTA";
        }
    }

    public void ispruziLevuRuku() {
        levaRuka.ispruzi();
        System.out.println(ime + ": je ispruzila levu ruku.");

        proveriDaLiMozeDaDrziNesto(desnaRuka);
    }
    public void ispruziDesnuRuku() {
        desnaRuka.ispruzi();
        System.out.println(ime + ": je ispruzila desnu ruku.");

        proveriDaLiMozeDaDrziNesto(levaRuka);
    }

    public void pridrzi(String sta) {
        if (levaRuka.jeSavijena() || desnaRuka.jeSavijena()) {
         staDrzi = sta;
            System.out.println(ime + ": pridrzava " + sta);
        } else {
            System.out.println(ime + ": ne moze da pridrzi " + sta);
        }
    }
    private String vevericaObeRukeIspruzene() {
        return "      |\\_/|\n"         +
                "     ( ^ ^ )\n"        +
                "    __\\ Y / __  __ \n" +
                "  O__       __O/  |\n" +
                "     \\   /    / _/\n" +
                "     /    \\ _/  /\n"  +
                "   _/ /\\\\  \\_/\n"   +
                "  /__/    \\__\\\n";
    }

    private String vevericaDesnaRukaSavijena() {
        return "      |\\_/|\n"         +
                "     ( ^ ^ )\n"        +
                "    __\\ Y / __  __ \n" +
                "  /        __O/  | \n" +
                "  \\    \\@ /  / _/\n" +
                "   \\_/   \\_/   /\n"  +
                "  _/ /\\\\ \\ __/ \n"  +
                " /__/   \\__\\";
     }

    private String vevericaLevaRukaSavijena() {
        return "      |\\_/|\n"         +
                "     ( ^ ^ )\n"        +
                "    __\\ Y /_    ___\n" +
                "  O__      \\  /   |\n"+
                "     \\ @/  / /  _/\n" +
                "    /   \\_/_/  /\n"   +
                "  _/ /\\\\ \\__/\n"    +
                " /__/   \\__\\";
    }

    private String vevericaObeRukeSavijene() {
        return "      |\\_/|\n"         +
                "     ( ^ ^ )\n"        +
                "    __\\ Y /_    ___\n" +
                "  /        \\  /   |\n"+
                "  \\   \\@/  / / _/ \n"+
                "   \\  / \\_/_/ / \n"  +
                "   _/ /\\\\ \\_/ \n"   +
                "  /__/   \\__\\";
    }
    private String getVevericaASCIIArt() {
        if (levaRuka.jeSavijena() && desnaRuka.jeSavijena()) {
            return vevericaObeRukeSavijene();
        }
        if (levaRuka.jeSavijena()) {
            return vevericaLevaRukaSavijena();
        }
        if (desnaRuka.jeSavijena()){
            return vevericaDesnaRukaSavijena();
        }
        return vevericaObeRukeIspruzene();
    }

    @Override
    public String toString() {
        String vevericaASCII = getVevericaASCIIArt();

        if (staDrzi.equals("NISTA")) {
            vevericaASCII = vevericaASCII.replace("@"," ");
        }
        return vevericaASCII;
    }
}
