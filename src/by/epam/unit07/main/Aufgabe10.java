package by.epam.unit07.main;

import java.util.Random;

public class Aufgabe10 {

	public static void main(String[] args) {
		int n=20;
		int[] mas= new int[n];
		
		Random rand=new Random();
		for (int i=0;i<mas.length;i++) {
			mas[i]=rand.nextInt(0,20);
		}
		for(int i=0;i<mas.length;i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		for(int i=0;i<mas.length;i++) {
			if(mas[i]>i) {
				System.out.println(mas[i]);
			}
		}

	}

}
