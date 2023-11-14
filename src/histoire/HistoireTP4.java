package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

//public class HistoireTP4 {

//public class HistoireTP4 {

//	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//
//		prof.direBonjour();
//		prof.acheter("boisson", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
//	}
//}
//    public static void main(String[] args) {
//        Humain prof = new Humain("Prof", "kombucha", 54);
//        
//        prof.direBonjour();
//        prof.acheter("boisson", 12);
//        prof.boire();
//        prof.acheter("jeu", 2);
//        prof.acheter("kimono", 50);
//        
//        
//    }
//}

//public class HistoireTP4 {
//	public static void main(String[] args) {
//		Commercant marco = new Commercant("Marco", 20);
//
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
//	}
//}

//public class HistoireTP4 {
//	public static void main(String[] args) {
//		Commercant marco = new Commercant("Marco", 20);
//		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//
//		yakuLeNoir.direBonjour();
//		yakuLeNoir.extorquer(marco);
//	}
//}

//public class HistoireTP4 {
//	public static void main(String[] args) {
//		Commercant marco = new Commercant("Marco", 20);
//		Ronin roro = new Ronin("Roro", "shochu", 60);
//
//		roro.direBonjour();
//		roro.donner(marco);
//	}
//}

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 45);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 0, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		roro.provoquer(yakuLeNoir);
	}
}