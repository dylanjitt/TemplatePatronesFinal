package decorator;

public class Funcionalities implements Iphone{
	
	private Iphone cel;


	public Iphone getCel() {
		return cel;
	}


	public void setCel(Iphone cel) {
		this.cel = cel;
	}



	public Funcionalities(Iphone cel) {
		super();
		this.cel = cel;
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
