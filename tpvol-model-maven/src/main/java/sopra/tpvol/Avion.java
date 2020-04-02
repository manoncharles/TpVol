package sopra.tpvol;

import java.util.ArrayList;

public class Avion {
	private String modele;
	private ArrayList<Vol> vols = new ArrayList<Vol>();

	public Avion() {
		super();
	}
	
	public Avion(String avion) {
		super();
		this.modele = avion;
	}

	public String getAvion() {
		return modele;
	}

	public void setAvion(String avion) {
		this.modele = avion;
	}

	public ArrayList<Vol> getVols() {
		return vols;
	}

	public void setVols(ArrayList<Vol> vols) {
		this.vols = vols;
	}

	public void addVol(Vol vols) {
		this.vols.add(vols);
	}

	@Override
	public String toString() {
		return "Avion [modele=" + modele + ", vols=" + vols + "]";
	}

	

}
