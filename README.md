# Bataille
Jeu de carte à 2 joueurs. Le principe est simple, on distribue tout les cartes du paquet à chaque joueur, chacun des joueurs pose la derniere carte de son paquet à tour de rôle et la carte la plus puissante gagne. Si les deux joueurs posent une carte de même valeur alors il y a bataille ! Dans ce cas là, les deux joueurs posent une carte face caché sur leur carte et reposent une carte face découverte et voit quelle carte est la plus puissante. 

# Organisation du programme

- 3 classes java : Joueur , Carte , Bataille(Main)

- La Classe Carte contient : un	constructeur	pour	créer	une	carte, Attributs	:	couleur	(parmi	un	tableau	statique)	et	valeur	(idem), Méthodes : JeuCarte, MelangeCarte, toString, ComparerCarte, GagnerCarte.

- La Classe Joueur contient : un	constructeur	pour	créer	un joueur, Attributs	: Paquet (Arraylist) et un compteur de point, Méthodes : TirerCarte, AjouteCarte, PossedeCarte, GetNombreCarte, GagnerPoint, toString.

- La Classe Bataille contient : un main, Méthodes : Distribuer, Jouer

#Compilation

`javac Bataille.java`

#Lancement

`java Bataille`

# Petit soucis

Comme il y'a souvent "Bataille", le jeu est très long et donc pas sur d'obtenir un résultat dans la seconde.
