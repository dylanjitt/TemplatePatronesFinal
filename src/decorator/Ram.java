package decorator;

public class Ram extends Funcionalities{
	
	private int ram;
	private String marca;
	private int costo;




	public Ram(Iphone cel, int ram, String marca, int costo) {
		super(cel);
		this.ram = ram;
		this.marca = marca;
		this.costo = costo;
	}




	@Override
	public void info() {
		super.info();
		System.out.println("Se añadio "+ram+" GB de RAM marca "+marca+"a su celular");
		super.addRAM(ram);
		super.addPrice(costo);
		super.info();
		System.out.println(" ");
			
	}

}
