package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class ArrayListExample {

	// There are two ways to fetch values from ArrayList;
		//1. Using Iterator
	    //2. Using Enchanced for loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add("Ashok");
		values.add(1);
		values.add(33.22);
		Iterator i= values.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		//System.out.println(i.next());
		// using hasNext method
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
		values.remove(33.22);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		values.add(2);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		values.remove(1);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		values.remove(1);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		// as we have seen out put it's adding at the last. What if I have to add element in between? Can I use below code?
		//values.add(1,2)// it's not possible add number in between using Arraylist class so we have to go for using LinkedList 



	}
}
