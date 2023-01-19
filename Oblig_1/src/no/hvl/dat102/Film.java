package no.hvl.dat102;

public class Film {

	public enum Sjanger {
		ACTION, DRAMA, HISTORY, SCIFI

	}
	
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
	
	

}
