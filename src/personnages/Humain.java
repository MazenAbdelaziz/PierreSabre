package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int argent;
	private int nbConnaissance;
	private Humain[] connaissances;
	private long[] tempsConnaissance;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.nbConnaissance = 0;
		this.connaissances = new Humain[30];
		this.tempsConnaissance = new long[30];
	}

	public String getNom() {
		return nom;
	}

	protected int getArgent() {
		return argent;
	}

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

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	private void memoriser(Humain autreHumain) {
		int index = -1;
		long tempsActuel = System.currentTimeMillis();

		for (int i = 0; i < nbConnaissance; i++) {
			if (connaissances[i] == autreHumain) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			tempsConnaissance[index] = tempsActuel;
		} else {
			if (nbConnaissance < 30) {
				connaissances[nbConnaissance] = autreHumain;
				tempsConnaissance[nbConnaissance] = tempsActuel;
				nbConnaissance++;
			} else {
				int indexOublier = 0;
				long tempsPlusAncien = tempsConnaissance[0];
				for (int i = 1; i < nbConnaissance; i++) {
					if (tempsConnaissance[i] < tempsPlusAncien) {
						tempsPlusAncien = tempsConnaissance[i];
						indexOublier = i;
					}
				}
				connaissances[indexOublier] = autreHumain;
				tempsConnaissance[indexOublier] = tempsActuel;
			}
		}
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);

		autreHumain.direBonjour();
		autreHumain.memoriser(this);
	}

	public void listerConnaissance() {
		System.out.print("(" + getNom() + ") - Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			if (i == nbConnaissance - 1) {
				parler(connaissances[i].getNom());
			} else {
				System.out.print(connaissances[i].getNom() + ", ");
			}
		}
	}

}
