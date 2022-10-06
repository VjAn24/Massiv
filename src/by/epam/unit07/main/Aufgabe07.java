package by.epam.unit07.main;

import java.util.Random;

public class Aufgabe07 {

	public static void main(String[] args) {
		int n=20,z=500;
		int[] mas=new int[n];
		
		Random rand=new Random();
		for(int i=0; i<mas.length; i++) {
			mas[i]= rand.nextInt(0,1000);
		}
		for(int i=0;i<mas.length;i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		int zahl=0;
		for(int i=0;i<mas.length;i++) {
			if(mas[i]>z) {
				mas[i]=z;
				zahl++;
			}
		}
		System.out.println();
		for(int i=0; i<mas.length;i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		System.out.println("\nКоличество замен="+zahl);

	}

}
