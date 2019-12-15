package net.jhashimoto.javaexecise.fifo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		var fifo = new FifoQueue();
		
		try {
			fifo.add("a");							// aを追加	a
			fifo.add(1);							// 1を追加	a,1

			System.out.println(fifo.indexOf("a"));	// aは0番目	a,1

			System.out.println(fifo.get()); 		// aを取得	1

			fifo.add("c");							// cを追加	1,c
			System.out.println(fifo.indexOf(1));	// 1は0番目	1,c
			
			System.out.println(fifo.get()); 		// 1を取得	c
			System.out.println(fifo.get());  		// cを取得
			
			//System.out.println(fifo.get());			// Itemがないのでエラー
		} catch (ItemNoneException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
