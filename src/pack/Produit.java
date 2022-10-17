package pack;

import java.util.GregorianCalendar;

public class Produit {
	int id;
	String libelle;
	String marque;
	float prix;
	GregorianCalendar dateExpiration;
	Produit () {}
	public Produit(int id, String libelle, String marque, float prix) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
		this.prix = prix;
	}
	public Produit(int id, String libelle, String marque) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
	};
	void afficher () {
		System.out.printf("id=%d , libelle=%s , marque= %s , prix = %f \n", id , libelle , marque , prix);
		
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + "]";
}

}
