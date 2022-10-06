package by.epam.unit07.main;

import java.util.Random;

public class Aufgabe05 {

	public static void main(String[] args) {
		int n=15;
		int[] mas=new int[n];
		Random rand=new Random();
		
		for (int i=0; i<mas.length; i++) {
			mas[i]=rand.nextInt();
		}
		int eben=0;
		for(int i=0; i<mas.length; i++) {
			if(mas[i]%2==0) {
			eben++;	
			}
		}
		int[]ebenN=new int[eben];
		for (int i=0, j=0; i<mas.length;i++) {
			if(mas[i]%2==0) {
				ebenN[j++]=i;
			}
		}
		
		for (int i=0; i<mas.length; i++) {
			System.out.printf("[%d]", mas[i]);
		}
		System.out.println();
		for (int i=0; i<ebenN.length; i++) {
			System.out.printf("{%d}", ebenN[i]);
		}

	}

}
