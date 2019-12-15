package net.jhashimoto.javaexecise.fifo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		var fifo = new FifoQueue();
		
		try {
			fifo.add("a");							// a��ǉ�	a
			fifo.add(1);							// 1��ǉ�	a,1

			System.out.println(fifo.indexOf("a"));	// a��0�Ԗ�	a,1

			System.out.println(fifo.get()); 		// a���擾	1

			fifo.add("c");							// c��ǉ�	1,c
			System.out.println(fifo.indexOf(1));	// 1��0�Ԗ�	1,c
			
			System.out.println(fifo.get()); 		// 1���擾	c
			System.out.println(fifo.get());  		// c���擾
			
			//System.out.println(fifo.get());			// Item���Ȃ��̂ŃG���[
		} catch (ItemNoneException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	}

}
