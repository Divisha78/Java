package DIV;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("ABC");
		pq.add("EFG");
		pq.add("IJK");
		//System.out.println("Head:" +pq.element());
		//System.out.println("Head:" +pq.peek());
		System.out.println(pq);
		/* Iterator itr=pq.iterator();
		 while(itr.hasNext());
		 {
			 System.out.println(itr.next());
		 }*/
		 pq.remove();
		 
		
		
		pq.poll();
		System.out.println(pq);
	

	}

}
