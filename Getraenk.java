package klausurvorbereitung;

public class Getraenk {
	private String name;
	private double menge;
	private double preis;
	public final static double DEFAULT = -1.0;
	
	public Getraenk(String name, double menge, double preis) {
		this.name = name;
		if (menge>0 && menge <= 1.0) {
			this.menge = menge;
		} else { this.menge = DEFAULT; }
		if (preis>=1.0 && preis <= 8.0) {
			this.preis = preis;
		} else { this.preis = DEFAULT; }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMenge() {
		return menge;
	}

	public void setMenge(double menge) {
		if (menge>0 && menge <=1.0) {
			this.menge = menge;
		}
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		if (preis>1.0 && preis <= 8.0) {
			this.preis = preis;
		}
	}
	@Override
	public String toString(){
		return "\nName: " + name + "\nPreis: " + preis + "\nMenge: " + menge;
	}

}
