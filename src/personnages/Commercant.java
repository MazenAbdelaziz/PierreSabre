package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int montantExtorque = getArgent();
		perdreArgent(montantExtorque); // Utilise la méthode de la classe parent
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return montantExtorque;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent); // Utilise la méthode de la classe parent
		parler(argent + " sous! Je te remercie généreux donateur!");
	}
}