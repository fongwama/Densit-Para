package cg.fongwama.densitepara.entite;


/**
 * @author Communauté Fongwama
 * 
 * @version 1.0
 * 
 * @Created 06/07/2015
 * 
 * @Description  Cette classe encapsule les informations n�cessaires pour le calcul de
 * la densit� parsitaire.
 */

public class Densite
{

	// d�claration des variables

	/**
	 * Repr�sente le nombre de paracite  P
	 */
	private long nombreParasite;


	/**
	 * Repr�sente le nombre de globules blanc GB
	 */
	private long nombreGlobuleBlanc;


	/**
	 * le nombre de globules blancs /� litre de sang
	 */
	
	private long nombreGloSang;


	/**
	 * Représente la densité
	 * D ===> densit� = parasite * g/�L / globules blancs
	 */
	
	private long densite;
	
	
	/**
	 * �chantillon permettant d'indentifier le propri�taire de la densite parasitaire calcul�e.
	 */
	
	private String echantillon;


	//le constructeur paramétrer

	public Densite(long nombreParasite, long nombreGlobuleBlanc,
			long nombreLeucocite, long densite) {
		super();
		this.nombreParasite = nombreParasite;
		this.nombreGlobuleBlanc = nombreGlobuleBlanc;
		this.nombreGloSang = nombreLeucocite;
		this.densite = densite;
	}


	//le constructeur non paramétré

	public Densite() {
		super();
		// TODO Auto-generated constructor stub
	}

	// les getters et setters
	
	public long getNombreParasite() {
		return nombreParasite;
	}


	public void setNombreParasite(long nombreParasite) {
		this.nombreParasite = nombreParasite;
	}


	public long getNombreGlobuleBlanc() {
		return nombreGlobuleBlanc;
	}


	public void setNombreGlobuleBlanc(long nombreGlobuleBlanc) {
		this.nombreGlobuleBlanc = nombreGlobuleBlanc;
	}


	public long getNombreGloSang() {
		return nombreGloSang;
	}


	public void setNombreGloSang(long nombreGloSang) {
		this.nombreGloSang = nombreGloSang;
	}


	public long getDensite() {
		return densite;
	}


	public void setDensite(long densite) {
		this.densite = densite;
	}


	public String getEchantillon() {
		return echantillon;
	}


	public void setEchantillon(String echantillon) {
		this.echantillon = echantillon;
	}  
}
