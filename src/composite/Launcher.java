package composite;

public class Launcher {
	public static void main(String[] args) {
		Zona z1 = new Zona("   Achocalla", 23, "Agua");
		Zona z2 = new Zona("   Mallasa", 56, "camino");
		
		Zona z3 = new Zona("   Prado", 87, "Agua");
		Zona z4 = new Zona("   San pedro", 67, "camino");
		
		Zona z5 = new Zona("   Fexpo", 49, "Agua");
		Zona z6 = new Zona("   Doble via la guardia", 37, "camino");
		
		Zona z7 = new Zona("Cotoca", 57, "Agua");
		Zona z8 = new Zona("Urubo", 109, "camino");
		
		Entity urb1 = new Entity("  Zona sur la paz", "electricidad");
		Entity urb2 = new Entity("  Zona norte la paz", "electricidad");
		Entity urb3 = new Entity("  Zona sur Santa Cruz", "electricidad");
		Entity urb4 = new Entity("  Zona norte Santa Cruz", "electricidad");
		
		urb1.add(z1);
		urb1.add(z2);
		urb2.add(z3);
		urb2.add(z4);
		urb3.add(z5);
		urb3.add(z6);
		urb4.add(z7);
		urb4.add(z8);
		
		Entity ciudad1 = new Entity(" La Paz", "Integracion vial");
		Entity ciudad2 = new Entity(" Santa Cruz", "Construcciones");
		
		ciudad1.add(urb1);
		ciudad1.add(urb2);
		ciudad2.add(urb3);
		ciudad2.add(urb4);
		
		Entity pais = new Entity("Bolivia", "Alimentacion e integracion");
		pais.add(ciudad1);
		pais.add(ciudad2);
		
		pais.info();
		
		
	}

}
