package jana60.valutazioni;

public class Studente {
	int id, assenze;
	double mediaVoti;

	Studente(int id, int assenze, double mediaVoti) {
		super();
		this.id = id;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
	}

	boolean valutazione() {
		boolean promossi = false;
		if (assenze > 50) {
			System.out.println("Lo studente con id: " + id + " é bocciato ");
		} else if (assenze >= 25 && assenze <= 50) {
			if (mediaVoti > 2) {
				System.out.println("Lo studente con id: " + id + " é promosso ");
				promossi = true;
			} else
				System.out.println("Lo studente con id: " + id + " é bocciato");
		} else if (mediaVoti >= 2) {
			System.out.println("Lo studente con id: " + id + " é promosso");
			promossi = true;
		}
		return promossi;
	}
}
