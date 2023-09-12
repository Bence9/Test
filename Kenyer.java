package myproducts;

public class Kenyer extends Aru {
	private double mennyiseg;

	public Kenyer(String megnevezes, int nettoAr, int afakulcs, double mennyiseg){
		super(megnevezes, nettoAr, afakulcs);
		this.mennyiseg = mennyiseg;
	}

	public double getMennyiseg() {
		return mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer:" + super.toString() + ", Egysegar="+ Egysegar();
	}
	
	private double Egysegar() {
		return bruttoAr()/mennyiseg;
	}
	
	public static int osszehasonlit(Kenyer egyik, Kenyer masik) {
		if(egyik.Egysegar() < masik.Egysegar()) {
			return -1;
		}
		else if(egyik.Egysegar() > masik.Egysegar()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
}
