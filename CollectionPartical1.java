import java.util.Collection;
import java.util.LinkedList;



class CollectionPractical1{
	public CollectionPractical1(){
		
	Collection<Integer> collection = new LinkedList();
	collection.add(1);
	collection.add(3);
	collection.add(4);
	collection.add(6);
	collection.add(9);
	
	collection.remove(4);
	System.out.println(collection);
}
public static void main(String[] args){
		new CollectionPractical1();
	}
}
	
	