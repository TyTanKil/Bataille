package batailleDeCartes;

import java.util.ArrayList;

public class Bataille {
	
	public static void main(String[] args) {
		System.out.println("Que la bataille commence !");
		
		
		Joueur j1 = new Joueur();
		Joueur j2 = new Joueur();
		
		
		Bataille.Jouer(j1,j2);
		
	}

	public static void Distribuer(Joueur j1, Joueur j2) {
		
		ArrayList<Carte> Paquet =  Carte.MelangeCarte(Carte.JeuCarte());
		
		for(int i = 0 ; i < Paquet.size() / 2; i++) {
			j1.AjouteCarte(Paquet.get(i));
		}
		
		for(int i = Paquet.size() / 2 ; i < Paquet.size();i++) {
			j2.AjouteCarte(Paquet.get(i));
		}
	}
	
	public static void Jouer(Joueur j1, Joueur j2) {
		
		System.out.println("Debut ok");
		
		Bataille.Distribuer(j1, j2);
		
		System.out.println("Distribution ok");
		
		while(j1.PossedeCarte() && j2.PossedeCarte()) {
			Carte.GagnerCarte(j1,j2);
		}
		
		if(j1.PossedeCarte() == false) {
			j2.GagnerPoint();
			System.out.println("Le joueur 2 a gagné la partie ! \n J1 :" + j1.toString() + " J2 : " + j2.toString());
		}
		else {
			j1.GagnerPoint();
			System.out.println("Le joueur 1 a gagné la partie ! \n J1 :" + j1.toString() + " J2 : " + j2.toString());}
	}
}
