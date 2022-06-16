package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int counterPromossi = 0;
		Scanner scan = new Scanner(System.in);
		Studente[] studente = new Studente[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Inserisci nome id studente: ");
			int id = scan.nextInt();
			System.out.println("Inserisci percentuale assenze: ");
			int assenze = scan.nextInt();
			System.out.println("Inserisci media voti: ");
			double mediaVoti = scan.nextDouble();
			studente[i] = new Studente(id, assenze, mediaVoti);
		}
		scan.close();
		for (int i = 0; i < 3; i++) {
			if (studente[i].valutazione() == true) {
				counterPromossi++;
			}
		}
		System.out.println("Sono stati promossi : " + counterPromossi);
	}

}
