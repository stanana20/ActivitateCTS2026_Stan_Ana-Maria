package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int valoare_finantare_elev = 30;

	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	public static void setValoare_finantare_elev(int valoare_finantare_elev) {
		Elev.valoare_finantare_elev = valoare_finantare_elev;
	}

	public Elev() {
		super();
	}

	@Override
	public void afiseazaFinantare() {
		System.out.println("Elevul "+getNume()+" "+getPrenume()+" primeste "+Elev.valoare_finantare_elev+" Euro/zi in proiect.");
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev{");
		sb.append(super.toString());
		sb.append("clasa=").append(clasa);
		sb.append(", tutore='").append(tutore).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
