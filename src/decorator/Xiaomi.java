package decorator;

public class Xiaomi implements Iphone {
	
	private int androidVersion;
	private int ram;
	private int storage;
	private int nroChips;
	private int buildVersion;
	private int precio;
	public Xiaomi(int androidVersion, int ram, int storage, int nroChips, int buildVersion, int precio) {

		this.androidVersion = androidVersion;
		this.ram = ram;
		this.storage = storage;
		this.nroChips = nroChips;
		this.buildVersion = buildVersion;
		this.precio = precio;
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
		System.out.println("CELULAr XIAOMI ");
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
