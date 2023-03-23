package decorator;

public class Launcher {

	public static void main(String[] args) {
		Iphone cel = new Phone("Samsung", 13, 8, 128, 2, 123456, 1000);
		cel.info();
		
		cel = new Ram(cel, "SanDisk", 200 ,8);
		cel.info();
		cel = new Audifonos(cel, "SONY", 100);
		cel.info();
		cel = new Cargador(cel, "Samsung", 50);
		cel.info();

	}

}
