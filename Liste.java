public class Liste {
	private Knoten start;
		
	public void setKnoten(Knoten start){
		this.start = start;
	}
	public Knoten getKnoten(){
		return start;
	}
	
	public String[] toArray(){
		int laenge = 1;
		Knoten k = start;
		while(k.getNext() != null){
			laenge++;
			k = k.getNext();
		}
		
		String[] listArray = new String[laenge];
		k = start;
		for(int i=0; k != null; i++){
			listArray[i] = k.getName();
			k = k.getNext();
		}
		return listArray;
	}	
}
