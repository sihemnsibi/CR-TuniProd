package pack;

import java.util.GregorianCalendar;
public class Main {
	public static void main () {
		 Produit produit1 = new Produit ();
		 Produit lait = new Produit (1021,"Lait","Delice");
		 Produit yaourt = new Produit (2510,"Yaourt","Vitalait");
		 Produit tomate = new Produit (3250,"Tomate","Sicam",1.200f);
		 lait.afficher();
		 yaourt.afficher();
		 tomate.afficher();
		 lait.prix=0.700f;
		 lait.afficher();
		 yaourt.prix=0.200f;
		 yaourt.afficher();
		 System.out.println(lait);
		 System.out.println(yaourt);
		 System.out.println(tomate);
		 lait.dateExpiration= new GregorianCalendar (2026, 11, 7);
		 System.out.println(lait.dateExpiration.getTime());
		 yaourt.dateExpiration= new GregorianCalendar (2024, 6, 15);
		 System.out.println(yaourt.dateExpiration.getTime());
		 tomate.dateExpiration= new GregorianCalendar (2025, 7, 22);
		 System.out.println(tomate.dateExpiration.getTime());
		 
	}



}
