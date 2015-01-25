package aufgabe5;

/*
 * Aufgabe 5b:
 * - Bei leerer Liste: Keine Rückgabe
 * - Bei Liste mit 1+x Objekten: Ausgabe des Namens des letzten Objektes in dieser Liste als String und mit nachfolgenden Zeilenumbruch.
 */

public class ListenTest {
	public static void main(String[] args){
		Liste liste = new Liste();
		Knoten Andreas = new Knoten("Andreas");
		liste.setKnoten(Andreas);
		Knoten Bernd = new Knoten("Bernd");
		Andreas.setNext(Bernd);
		Knoten Christian = new Knoten("Christian");
		Bernd.setNext(Christian);
		
		System.out.print(liste.toArray()[2]);
		
	}
}
