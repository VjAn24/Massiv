package by.epam.unit07.main;

import java.util.Random;

public class Aufgabe06 {

	public static void main(String[] args) {
		int[] mas=new int[20];
		int min;
		Random rand= new Random();
		for (int i=0; i<mas.length; i++) {
			mas[i]=rand.nextInt(0,1000);
		}
		min=mas[0];
		for (int i=0; i<mas.length; i++) {
			if(mas[i]<min) {
				min=mas[i];
			}
		}
		for(int i=0; i<mas.length; i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		System.out.println();
		System.out.printf("min =%4d\n", min);


	}

}
