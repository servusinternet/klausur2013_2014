package klausurvorbereitung;

public class SaftGetraenk extends Getraenk {
	private double fruchtgehalt;
	
	public SaftGetraenk(String name, double menge, double preis, double fruchtgehalt) {
		super(name, menge, preis);
		if (fruchtgehalt >=0 && fruchtgehalt <= 100) {
			this.fruchtgehalt = fruchtgehalt;
		} else { this.fruchtgehalt = DEFAULT; }
	}
	
	public void setFruchtgehalt(double fruchtgehalt) {
		if (fruchtgehalt>=0 && fruchtgehalt<=100.0) {
			this.fruchtgehalt = fruchtgehalt;
		}
	}
	
	public double getFruchtgehalt() {
		return fruchtgehalt;
	}
	@Override
	public String toString() {
		return "Name: " + getName() + "\nMenge: " + getMenge() + "\nPreis: " + getPreis() + "\nFruchtgehalt: " + getFruchtgehalt();
	}

}
