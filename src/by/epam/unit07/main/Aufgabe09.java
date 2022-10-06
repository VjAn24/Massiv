package by.epam.unit07.main;

import java.util.Random;

public class Aufgabe09 {

	public static void main(String[] args) {
		int n=10;
		int[] mas= new int[n];
		
		Random rand=new Random();
		for(int i=0; i<mas.length; i++) {
			mas[i]= rand.nextInt(0,1000);
		}
		for(int i=0;i<mas.length;i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		int min, max, zus, numer1=0, numer2=0;
		min=mas[0];
		for (int i=0;i<mas.length;i++) {
			if(mas[i]<min) {
				min=mas[i];
				numer1=i;
			}
		}
		max=mas[0];
		for(int i=0;i<mas.length;i++) {
			if(mas[i]>max) {
				max=mas[i];
				numer2=i;
			}
		}
		zus=mas[numer1];
		mas[numer1]=mas[numer2];
		mas[numer2]=zus;
		System.out.println();
		for(int i=0;i<mas.length;i++) {
			System.out.printf("[%4d]", mas[i]);
		}
	}

}
