package collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyclass {
	public static void main(String[] args) {
		
	
	List k = new CopyOnWriteArrayList<>();
	  k.add("shiva");
	  k.add("sai");
	  k.add("nari");
	  
	  Iterator<String> z = k.iterator();
	  k.add("mad");
	  while(z.hasNext()) {
		  String v = z.next();
		  
		  System.out.println(v);
	  }
	  System.out.println(k);
}
}
/*copyonwrterarraylist synchroniztion not directly use its use segment process
if use concurrentmodificaiton exception
fail fast
fail safe
in same object we just modified but not possible to add and remove in same object in iteration time
that time if u add or remove its show concurrentmodfication exception
its overcome by copyonwriterarraylist(copy) so data mofified in copy and actual data is actal object.abstract*/