package composite;

public class Zona extends Component {

	public Zona(String nombre, int nhab, String poa) {
		super(nombre, nhab, poa);
	}

	@Override
	public void info() {
		System.out.println("> "+getNombre()+" # hab.: "+getNhab()+" (POA:"+getPoa()+")");
		
	}
	
	

}
