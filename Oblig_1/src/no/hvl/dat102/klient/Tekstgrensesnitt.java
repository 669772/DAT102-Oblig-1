package no.hvl.dat102.klient;

import java.util.Scanner;
import java.lang.*;

import no.hvl.dat102.*;
import no.hvl.dat102.adt.*;

public class Tekstgrensesnitt {

	private Filmarkiv arkiv;

	public Tekstgrensesnitt() {
		arkiv = new Filmarkiv();
	}

	public Tekstgrensesnitt(int lengde) {
		arkiv = new Filmarkiv(lengde);
	}

	public Filmarkiv getArkiv() {
		return arkiv;
	}

	public void setArkiv(Filmarkiv arkiv) {
		this.arkiv = arkiv;
	}

	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm() {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Søk etter Tittel eller Produsent: ");
			String tEp = scanner.nextLine();
			tEp = tEp.toLowerCase();
			String svT;
			Film[] sTab = null;
			if (tEp.equals("tittel")) {
				System.out.println("Hva er Tittelen: ");
				svT = scanner.nextLine();

				sTab = arkiv.soekTittel(svT);
				skrivUtFilmProdusent(arkiv, svT);
			} else if (tEp.equals("produsent")) {
				System.out.println("Hva er Produsent: ");
				svT = scanner.nextLine();

				sTab = arkiv.soekProdusent(svT);
				skrivUtFilmDelstrengITittel(arkiv, svT);
			} else {
				System.out.println("Fac u!!");
			}

			System.out.println("Hvilke av disse? ");
			String index = scanner.nextLine();
			int intIndex = 0;
			intIndex = Integer.parseInt(index);

			Film svar = sTab[intIndex];

			return svar;
		}
	}

	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		String svar = "\nNummer: " + film.getFilmnr() + "\nFilmselskap: " + film.getFilmselskap() + "\nÅr:"
				+ film.getLanseringsaar() + "\nProdusent: " + film.getProdusent() + "\nTittel: " + film.getTittel()
				+ "\nSjanger: " + film.getSjanger();
		System.out.println(svar);
	}

	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		Film[] svar = filma.soekTittel(delstreng);

		for (int i = 0; i < svar.length; i++) {
			visFilm(svar[i]);
		}
	}

	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		Film[] svar = filma.soekProdusent(delstreng);

		for (int i = 0; i < svar.length; i++) {
			visFilm(svar[i]);
		}
	}

	public void skrivUtStatistikk(FilmarkivADT filma) {

		String ut = "\nAntall filmer: " + filma.antall() + "\nAction: " + filma.antall(Sjanger.ACTION) + "\nDrama: "
				+ filma.antall(Sjanger.DRAMA) + "\nHistory: " + filma.antall(Sjanger.HISTORY) + "\nSciFi: "
				+ filma.antall(Sjanger.SCIFI);

		System.out.print(ut);
	}

}