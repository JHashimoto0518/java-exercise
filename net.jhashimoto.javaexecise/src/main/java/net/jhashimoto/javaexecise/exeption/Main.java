package net.jhashimoto.javaexecise.exeption;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> nullList = null;

		try {
			nullList.size();
		} catch (NullPointerException e) {
			/*
			  java.lang.NullPointerException
			  	at net.jhashimoto.javaexecise.exeption.Main.main(Main.java:11)
			 */
			e.printStackTrace();
		}

		List<String> emptyList = new ArrayList<>();

		try {
			emptyList.get(0);
		} catch (IndexOutOfBoundsException e) {
			/*
			  java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
			 	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
				at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
				at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
				at java.base/java.util.Objects.checkIndex(Objects.java:372)
				at java.base/java.util.ArrayList.get(ArrayList.java:458)
				at net.jhashimoto.javaexecise.exeption.Main.main(Main.java:19)
			*/
			e.printStackTrace();
		}
	}
}
