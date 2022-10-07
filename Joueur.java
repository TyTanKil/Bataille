package batailleDeCartes;

import java.util.ArrayList;

public class Joueur {
	
	private ArrayList<Carte> Paquet = new ArrayList<Carte>() ;
	
	private int CompteurPoint;
	
	public Joueur() {
		this.CompteurPoint = 0;
	}
	
	public Carte TirerCarte() {
		if(this.PossedeCarte()) {
			Carte CarteMise = this.Paquet.get(0);
			System.out.println("Le joueur a tiré une carte ! Il s'agit de : " + CarteMise);
			this.Paquet.remove(0);
			return CarteMise;
		}
		return null;
	}
	
	public void AjouteCarte(Carte carte) {
		this.Paquet.add(carte);
	}
	
	public boolean PossedeCarte() {
		if(Paquet.size() == 0) {
			return false;
		}
		return true;
	}
	
	public int GetNombreCarte() {
		return this.Paquet.size();
	}
	
	public void GagnerPoint() {
		this.CompteurPoint =+ 1;
	}
	
	public String toString() {
		return this.CompteurPoint + "";
	}
}
