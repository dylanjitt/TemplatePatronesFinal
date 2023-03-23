package decorator;

public class Ram extends Funcionalities{
	
	private int ram;
	

	public Ram(Iphone cel, String marca, int costo, int ram) {
		super(cel, marca, costo);
		this.ram = ram;
	}



	@Override
	public void info() {
		
		System.out.println("Se añadio "+ram+" GB de RAM marca "+super.getMarca()+" a su celular");
		super.addRAM(ram);
		super.addPrice(super.getCosto());
		super.info();
		//System.out.println("\n");
			
	}

}
