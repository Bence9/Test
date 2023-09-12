package aruk.futtat;

import myproducts.Aru;
import myproducts.Kenyer;

public class AruTeszt {

	public static void main(String[] args) {
		Aru aru = new Aru("sor",320,27);
		Kenyer kenyer = new Kenyer("Feher", 400, 5, 0.75);
		
		System.out.println(aru);
		System.out.println(kenyer);
		
		int eredmeny=aru.Osszehasonlit(kenyer);
		System.out.println(eredmeny);
		
		Kenyer masikkenyer =new Kenyer("kicsi", 200, 5, 0.25);
		int hasonlit=kenyer.Osszehasonlit(masikkenyer);
		System.out.println(hasonlit);
		
		hasonlit = Kenyer.osszehasonlit(kenyer, masikkenyer);
		System.out.println(hasonlit);
		
		Aru kenyer2 = new Kenyer("Magos", 400, 5, 0.5);
		System.out.println(kenyer2);
		
		//Igy lehet atkonvertalni,ha a kenyer2 aru osztalybol lett letrehozva
		Kenyer.osszehasonlit(kenyer, (Kenyer)kenyer2);
		
	}
	
}
