package ua.od.fabrika;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CryptoRithmDemo {

	
	
	private static Random random = new Random();

	public static void main(String[] args) {
		// letters order: l,i,s,a,v,o,k,z,e,r
		Integer[] arr = getLetters(10);				
		int lisa = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
		int volk = arr[4] * 1000 + arr[5] * 100 + arr[0] * 10 + arr[6];
		int zveri = arr[7] * 10000 + arr[4] * 1000 + arr[8] * 100 + arr[9] * 10 + arr[1];
		System.out.println(lisa + " + " + volk + " = " + zveri);
	}

	private static Integer[] getLetters(int quantity) {
		Set<Integer> lettersSet = new LinkedHashSet<>();
		for (int i = 0; i < quantity; i++) {
			int val;
			while (true) {
				val = random.nextInt(10);
				System.out.println(val);
				if (val == 0) {
					continue;
				} else if (lettersSet.add(val)) {
					break;
				}
			}
		}
		System.out.println(lettersSet);
		return lettersSet.toArray(new Integer[10]);
	}

}
