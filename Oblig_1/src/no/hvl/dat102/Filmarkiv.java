package no.hvl.dat102;

import java.util.*;

import no.hvl.dat102.adt.*;

public class Filmarkiv implements FilmarkivADT {

	protected Film[] data;
	protected int nesteledig;

	public Filmarkiv() {
		data = new Film[20];
		nesteledig = 0;
	}

	public Filmarkiv(int lengde) {
		data = new Film[lengde];
		nesteledig = 0;
	}

	public Film[] getData() {
		return data;
	}

	public void setData(Film[] data) {
		this.data = data;
	}

	public int getNesteledig() {
		return nesteledig;
	}

	public void setNesteledig(int nesteledig) {
		this.nesteledig = nesteledig;
	}

	@Override
	public Film finnFilm(int nr) {

		boolean funnet = false;
		int i = 0;
		Film svar = null;

		while (funnet == false && i < nesteledig) {

			if (data[i].getFilmnr() == nr) {
				funnet = true;
				svar = data[i];
			}

			i++;
		}

		return svar;
	}

	private void utvid() {
		Film[] nytab = new Film[data.length * 2];
		nesteledig = 0;

		for (int i = 0; i < data.length; i++) {
			nytab[i] = data[i];
			nesteledig++;
		}

		data = nytab;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {

		if (nesteledig < data.length) {
			data[nesteledig] = nyFilm;
			nesteledig++;
		} else {
			utvid();
			data[nesteledig] = nyFilm;
			nesteledig++;
		}

	}

	@Override
	public boolean slettFilm(int filmnr) {

		boolean svar = false;

		for (int i = filmnr; i <= nesteledig; i++) {
			if (i == nesteledig) {
				data[i] = null;
				svar = true;
			} else {
				data[i] = data[i + 1];
			}
		}
		nesteledig--;

		return svar;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}
}