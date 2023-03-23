package composite;

import java.util.ArrayList;
import java.util.List;

public class Entity extends Component{
	
	private List<Component> zones = new ArrayList<>();

	public Entity(String nombre, String poa) {
		super(nombre,0, poa);
		
	}

	@Override
	public void info() {
		System.out.println(getNombre()+" Total habitantes: "+getNhab()+", POA: "+getPoa());
		for (Component c:zones) {
			c.info();
		}
		System.out.println(" ");
	}
	
	public void plusN(int n) {
		super.setNhab(super.getNhab()+n);
	}
	
	public void add (Component c) {
		zones.add(c);
		plusN(c.getNhab());
	}
	
	public void remove (Component c) {
		zones.remove(c);
		plusN(-c.getNhab());
	}
	
	public Component get(int posicion) {
		return zones.get(posicion);
	}

}
