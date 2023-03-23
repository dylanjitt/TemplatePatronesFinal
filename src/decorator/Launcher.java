package decorator;

public class Launcher {

	public static void main(String[] args) {
		Iphone cel = new Huawei( 13, 8, 128, 2, 123456, 1000);
		cel = new Ram(cel, "SanDisk", 200 ,8);
		cel = new Audifonos(cel, "SONY", 100);
		cel = new Cargador(cel, "Samsung", 50);
		cel.info();
		
		Iphone c2 = new Xiaomi( 13, 8, 128, 2, 123456, 1000);
		c2 = new Ram(c2, "SanDisk", 200 ,8);
		c2 = new Audifonos(c2, "SONY", 100);
		c2 = new Cargador(c2, "Samsung", 50);
		c2.info();

	}

}
