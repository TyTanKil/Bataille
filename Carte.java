package batailleDeCartes;

import java.util.ArrayList;

public class Carte {
	
	private int Couleur;
	private int Valeur;
	
	private static String [] NomCouleur = {"Coeur","Carreaux","Pique","Trefle"} ;
	private static String [] NumValeur = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","AS"};
	
	public Carte(int color, int val) {
		this.Couleur = color;
		this.Valeur = val;
	}
	
	
	public static ArrayList<Carte> JeuCarte() {
		
		ArrayList<Carte> deck = new ArrayList<Carte>();
		
		for (int couleurNum=0; couleurNum < Carte.NomCouleur.length; couleurNum++ ) {
			for (int valeurNum=0; valeurNum < Carte.NumValeur.length; valeurNum++) {
				Carte c = new Carte(couleurNum,valeurNum);
				deck.add(c);
			}
		}
		return deck;
	}
	
	public static ArrayList<Carte> MelangeCarte(ArrayList<Carte> PaquetCarte) {
		
		ArrayList<Carte> deck = new ArrayList<Carte>();
		int TaillePaquet = PaquetCarte.size();
		
		for (int i = 0; i < TaillePaquet;i++) {
			int IndiceCarte = (int)Math.floor(Math.random() * PaquetCarte.size() );
			deck.add(PaquetCarte.get(IndiceCarte));
			PaquetCarte.remove(IndiceCarte);
		}
		
		return deck;
	}
	
	public String toString() {
		return"Couleur : " + NomCouleur[this.Couleur] + ", Valeur : " + NumValeur[this.Valeur];
	}
	
	public int ComparerCarte(Carte carte) {
		
		if(this.Valeur > carte.Valeur) {
			return 1;
		}
		
		else if(this.Valeur < carte.Valeur){
			return 0;
		}
		
		else{
			return -1;
		}
		
	}
	
	public static void GagnerCarte(Joueur j1, Joueur j2) {
		
		ArrayList<Carte> Deck = new ArrayList<Carte>();
		
		Deck.add(j1.TirerCarte());
		Deck.add(j2.TirerCarte());
		
		
		while(Deck.get(Deck.size() - 1).ComparerCarte(Deck.get(Deck.size() - 2)) == -1) {
			Deck.add(j1.TirerCarte());
			Deck.add(j2.TirerCarte());
			Deck.add(j1.TirerCarte());
			Deck.add(j2.TirerCarte());
		}
		
		if(Deck.get(Deck.size() - 1) != null){
			if(Deck.get(Deck.size() - 1).ComparerCarte(Deck.get(Deck.size() - 2)) == 1) {
				for(int i = 0; i < Deck.size();i++) 
					j1.AjouteCarte(Deck.get(i));
			}
			else {
				for(int i = 0; i < Deck.size();i++) 
					j2.AjouteCarte(Deck.get(i));
			}
		}
	}
	
	
}
