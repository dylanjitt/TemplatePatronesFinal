package decorator;

public class Audifonos extends Funcionalities {

	private String marca;
	private int costo;
	
	
	public Audifonos(Iphone cel, String marca, int costo) {
		super(cel);
		this.marca = marca;
		this.costo = costo;
	}



	@Override
	public void info() {
		super.info();
		System.out.println("Se añadieron Audifonos "+marca+" a su compra");
		super.addPrice(costo);
		super.info();
	}

}
