package bridge;

public class Twitter implements IsocialNetwork{
	
	private IsystemInscription edu;

	public Twitter(IsystemInscription edu) {
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
		System.out.println("- INFO EN TWITTER:");
		edu.info();
		
	}

}
