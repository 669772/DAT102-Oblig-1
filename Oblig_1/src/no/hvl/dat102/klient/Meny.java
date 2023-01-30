package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;

public class Meny {
    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;

    public Meny(FilmarkivADT filmarkiv) {
        tekstgr = new Tekstgrensesnitt();
        this.filmarkiv = filmarkiv;
    }

    public void start() {
        Film f1 = new Film(1,"DreamWorks","Pus med Støvler",2023,Sjanger.ACTION,"DreamWorks");
        Film f2 = new Film(2,"Disney","Laidy Og Landstrykeren",1600,Sjanger.HISTORY,"Disney");
        Film f3 = new Film(3,"Pixar","Nemo",2010,Sjanger.ACTION,"Disney");

        filmarkiv.leggTilFilm(f1);
        filmarkiv.leggTilFilm(f2);
        filmarkiv.leggTilFilm(f3);

        FilmarkivADT arkiv = tekstgr.getArkiv();

        arkiv = filmarkiv;
        
        tekstgr.lesFilm();
    }
}