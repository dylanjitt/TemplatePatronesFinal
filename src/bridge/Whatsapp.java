package bridge;

public class Whatsapp implements IsocialNetwork{
	
	private IsystemInscription edu;

	public Whatsapp(IsystemInscription edu) {
		this.edu = edu;
	}

	public IsystemInscription getEdu() {
		return edu;
	}

	public void setEdu(IsystemInscription edu) {
		this.edu = edu;
	}

	@Override
	public void info() {
		System.out.println("- INFO EN WHATSAPP:");
		edu.info();
		
	}

}
