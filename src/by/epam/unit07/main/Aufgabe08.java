package by.epam.unit07.main;

import java.util.Random;

public class Aufgabe08 {

	public static void main(String[] args) {
		int n=50;
		int[] mas=new int[n];
		
		Random rand=new Random();
		for(int i=0; i<mas.length; i++) {
			mas[i]= rand.nextInt(-1000,1000);
		}
		for(int i=0;i<mas.length;i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		for(int i=0;i<mas.length;i++) {
			System.out.printf("[%4d]", mas[i]);
		}
		int pos=0, zero=0, neg=0;
		for(int i=0;i<mas.length;i++) {
			if(mas[i]>0) {
				pos++;
			}else if(mas[i]<0) {
				neg++;
			}else if(mas[i]==0) {
				zero++;
			}
		}
		System.out.println("\nZahl positive="+pos+"\nZahl negative="+neg+"\nZahl null="+zero);

	}

}
