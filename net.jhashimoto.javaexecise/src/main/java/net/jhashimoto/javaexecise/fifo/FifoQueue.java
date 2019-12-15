package net.jhashimoto.javaexecise.fifo;

import java.util.ArrayList;
import java.util.List;

public class FifoQueue {
	List<Object> queue = new ArrayList<Object>();

	public void add(Object item) {
		queue.add(item);
	}
	
	public Object get() throws ItemNoneException {
		if (queue.size() <= 0) {
			throw new ItemNoneException("—v‘f‚ª‚ ‚è‚Ü‚¹‚ñB");
		}
		
		var first = queue.get(0);
		queue.remove(0);
		return first;
	}
	
	public Integer indexOf(Object item) {
		return queue.indexOf(item);
	}
}