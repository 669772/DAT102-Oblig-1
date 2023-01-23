package no.hvl.dat102;

import java.util.Objects;

public class Film {
	
	private int filmnr;
	private String produsent;
	private String titel;
	private int lanseringsaar;
	private Sjanger sjanger;
	private String filmselskap;

	public Film() {
		
	}

	public Film(int filmnr, String produsent, String titel, int lanseringsaar, Sjanger sjanger, String filmselskap) {

		this.filmnr = filmnr;
		this.produsent = produsent;
		this.titel = titel;
		this.lanseringsaar = lanseringsaar;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;

	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getLanseringsaar() {
		return lanseringsaar;
	}

	public void setLanseringsaar(int lanseringsaar) {
		this.lanseringsaar = lanseringsaar;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return filmnr == other.filmnr && Objects.equals(titel, other.titel);
	}
	
	
}
