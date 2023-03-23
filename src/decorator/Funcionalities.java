package decorator;

public class Funcionalities implements Iphone{
	
	private Iphone cel;
	private String marca;
	private int costo;

	public Iphone getCel() {
		return cel;
	}


	public void setCel(Iphone cel) {
		this.cel = cel;
	}

	public Funcionalities(Iphone cel, String marca, int costo) {
		super();
		this.cel = cel;
		this.marca = marca;
		this.costo = costo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getCosto() {
		return costo;
	}


	public void setCosto(int costo) {
		this.costo = costo;
	}


	@Override
	public void info() {
		cel.info();
		
	}
	
	@Override
	public void addPrice(int n) {
		cel.addPrice(n);
	}
	
	@Override
	public void addRAM(int n) {
		cel.addRAM(n);
	}




}
