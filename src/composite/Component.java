package composite;

public abstract class Component {
	
	private String nombre;
	private int nhab;
	private String poa;
	public Component(String nombre, int nhab, String poa) {
		this.nombre = nombre;
		this.nhab = nhab;
		this.poa = poa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNhab() {
		return nhab;
	}
	public void setNhab(int nhab) {
		this.nhab = nhab;
	}
	public String getPoa() {
		return poa;
	}
	public void setPoa(String poa) {
		this.poa = poa;
	}
	
	public abstract void info();
	
	
	
	

}
