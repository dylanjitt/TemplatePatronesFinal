package decorator;

public class Audifonos extends Funcionalities {


	public Audifonos(Iphone cel, String marca, int costo) {
		super(cel, marca, costo);

	}

	@Override
	public void info() {
		
		System.out.println("Se añadieron Audifonos "+super.getMarca()+" a su compra");
		super.addPrice(super.getCosto());
		super.info();
	}

}
