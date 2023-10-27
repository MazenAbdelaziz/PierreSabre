package personnages;

public class Humain {
	// champs privés
	private String nom;
	private String boissonFavorite;
	private int argent;

	// constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	// accesseurs en lecture
	public String getNom() {
		return nom;
	}

//	public int getArgent() {
//		return argent;
//	}

	protected int getArgent() {
		return argent;
	}
	// méthodes

//	private void parler(String texte) {
//		System.out.println("(" + nom + ") - " + texte);
//	}

	protected void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS!");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			argent -= prix;
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix
					+ " sous.");
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à "
					+ prix + " sous.");
		}
	}

//	public void gagnerArgent(int gain) {
//		argent += gain;
//	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

//	public void perdreArgent(int perte) {
//		argent -= perte;
//	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

}
