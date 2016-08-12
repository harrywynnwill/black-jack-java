
public class Table {
	
	public static final String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	public Table(){
		
	}
	public void MakeDeck(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card card = new Card("harry", "is", 1);
		Table table = new Table();
//		System.out.print(table);
		for (String card : RANKS){
			System.out.println(card);
		}
		
	}

}
