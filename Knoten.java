public class Knoten {
	private String name;
	private Knoten next;
	
	public Knoten(String name){
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNext(Knoten next){
		this.next = next;
	}
	
	public String getName(){
		return name;
	}
	public Knoten getNext(){
		return next;
	}
}
