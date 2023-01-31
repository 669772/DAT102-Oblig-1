package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT{

	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2() {
		start = null;
		antall = 0;
	}
	
	@Override
	public Film finnFilm(int nr) {
		
		boolean funnet = false;
		int i = 0;
		Film svar = null;
		
		while (funnet == false && i < antall) {
			if (start.getElement().getFilmnr() == nr) {
				funnet = true;
				svar = start.getElement();
				return svar;
			}
			start = start.getNeste();
		}
		return svar;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		return false;
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
