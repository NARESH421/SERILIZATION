package collections;

import java.util.concurrent.Callable;

public class callable implements Callable {

	@Override
	public Integer call() throws Exception {
		int count=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			count=count+i;
			
		}
		return count;
	}

}
