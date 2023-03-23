package bridge;

public class Launcher {

	public static void main(String[] args) {
		Colegio cole = new Colegio("CIBA", 39, "C.I. 1000$");
		cole.add("Dylan Jitton");
		cole.add("Luz Noceda");
		cole.add("Anne Boonchuy");
		
		Escuela escu = new Escuela("Martin Cardenas", 3, "Certif. Nacimiento");
		escu.add("Reagan Ridley");
		escu.add("brett hand");
		escu.add("Gigi reynolds");
		escu.add("homero Simpson");
		
		Universidad u = new Universidad("UPB", 109, "Certificado de Graduacion");
		u.add("Tame Impala");
		u.add("The Weeknd");
		u.add("Miley Cyrus");
		u.add("Damon Albarn");
		
		
		Facebook fc = new Facebook(cole);
		Facebook fe = new Facebook(escu);
		Facebook fu = new Facebook(u);
		
		fc.info();fe.info();fu.info();
		
		Whatsapp w = new Whatsapp(cole);
		w.info();
		
		Twitter t = new Twitter(u);
		t.info();
	}

}
