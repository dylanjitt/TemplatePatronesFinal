package decorator;

public class Phone implements Iphone {
	
	private String marca;
	private int androidVersion;
	private int ram;
	private int storage;
	private int nroChips;
	private int buildVersion;
	private int precio;
	public Phone(String marca, int androidVersion, int ram, int storage, int nroChips, int buildVersion, int precio) {
		this.marca = marca;
		this.androidVersion = androidVersion;
		this.ram = ram;
		this.storage = storage;
		this.nroChips = nroChips;
		this.buildVersion = buildVersion;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAndroidVersion() {
		return androidVersion;
	}
	public void setAndroidVersion(int androidVersion) {
		this.androidVersion = androidVersion;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getNroChips() {
		return nroChips;
	}
	public void setNroChips(int nroChips) {
		this.nroChips = nroChips;
	}
	public int getBuildVersion() {
		return buildVersion;
	}
	public void setBuildVersion(int buildVersion) {
		this.buildVersion = buildVersion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public void info() {
		System.out.println("CELULAR: "+marca);
		System.out.println("Android: "+androidVersion);
		System.out.println("RAM: "+ram+"GB");
		System.out.println("Storage: "+storage+"GB");
		System.out.println("SIM slots: "+nroChips);
		System.out.println("Build Version: "+buildVersion);
		System.out.println("PRICE: "+precio+"$");
		System.out.println("\n");
		
	}
	@Override
	public void addPrice(int n) {
		precio+=n;
		
	}
	@Override
	public void addRAM(int n) {
		ram+=n;
		
	}
	
	
	
	

}
