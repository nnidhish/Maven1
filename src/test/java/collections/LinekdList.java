package collections;

import java.util.LinkedList;

public class LinekdList {
	public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
 
        // Adding elements to the linked list
        ll.add("Ashok");
        ll.add("Anil");
        ll.addLast("Manoj");
        ll.addFirst("Ramesh");
        ll.add(2, "Harish");
         
        System.out.println(ll);
 
        ll.remove("Anil");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}
