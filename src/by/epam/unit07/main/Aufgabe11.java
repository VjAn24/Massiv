package by.epam.unit07.main;

import java.util.Random;

public class Aufgabe11 {

	public static void main(String[] args) {
		int n=30;
		int[] mas = new int[n];
		Random rand = new Random();
		for (int i=0; i<mas.length; i++) {
			mas[i]=rand.nextInt(-100,100);
		}
		int M=3;
		int L;
		for (int i=0;i<mas.length;i++) {
			L=mas[i]%M;
			if(0<L && L<(M-1)) {
				System.out.printf("[%d]", mas[i]);
			}
		}

	}

}
