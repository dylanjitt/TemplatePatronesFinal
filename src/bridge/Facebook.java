package bridge;

public class Facebook implements IsocialNetwork{
	
	private IsystemInscription edu;

	public Facebook(IsystemInscription edu) {
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
		System.out.println("- INFO EN FACEBOOK:");
		edu.info();
		
	}
	
	

}
