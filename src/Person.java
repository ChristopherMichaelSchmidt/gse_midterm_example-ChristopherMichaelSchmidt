public class Person {

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    private String vorname;
    private String nachname;
    private int koerpergroesse;
    private byte aktivitaetslevel;

    public String rechneBMI(int gewicht){
        String ergebnis= "";
        double bmi = bmi = gewicht / ((koerpergroesse / 100.0) * (koerpergroesse / 100.0));
        if(bmi>30){ ergebnis = "Adipositas";}
        if(bmi>=25.1){ ergebnis = "Übergewicht";}
        if(bmi>=18.5){ ergebnis = "Normalgewicht";}
        if(bmi<18.5){ ergebnis = "Untergewicht";}
        return ergebnis;





    }
    public void printPerson(int gewicht){
        String ergebnis = "";
        if(aktivitaetslevel==1){ ergebnis = "Couch Potato";}
        if(aktivitaetslevel==2){ ergebnis = "Gelegenheitssportler";}
        if(aktivitaetslevel==3){ ergebnis = "Sportler";}
        if(aktivitaetslevel==4){ ergebnis = "Profisportler";}
        System.out.println(vorname +" "+ nachname+ " "+rechneBMI(gewicht) + ergebnis);




    }







}

