package by.epam.unit07.main;

public class Aufgabe02 {

	public static void main(String[] args) {
		int[] mas= new int[] {468,8465645,849,320,0,84446,88,0,8798,0,4848,48979,668,0,48846,879,0,848};
		int countZero=0;
		for (int i=0; i<mas.length;i++) {
			if(mas[i]==0) {
				countZero++;
			}
		}
		int[] zeroPositionsArray = new int [countZero];
		for (int i=0, j=0 ;i<mas.length; i++) {
			if (mas[i]==0) {
				zeroPositionsArray[j++]=i;
			}
		}
		for(int i=0; i<zeroPositionsArray.length; i++) {
			System.out.printf("{%d}", zeroPositionsArray[i]);
		}

	}

}
