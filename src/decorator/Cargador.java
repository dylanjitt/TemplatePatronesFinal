package decorator;

public class Cargador extends Funcionalities {
	

	
	public Cargador(Iphone cel, String marca, int costo) {
		super(cel, marca, costo);

	}

	@Override
	public void info() {
		
		System.out.println("Se añadio un cargador "+super.getMarca()+" a su compra");
		super.addPrice(super.getCosto());
		super.info();
	}
	
	

}
