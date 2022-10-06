package by.epam.unit07.main;

public class Aufgabe04 {

	public static void main(String[] args) {
		int[] mas=new int[] {1,2,3,4,5,9,8,10};
		boolean fact=true; 
		for (int i=1; i<mas.length; i++) {
			if(mas[i]<mas[i-1]) {
				fact=false;
				break;
			}
		}
		if(fact) {
			System.out.println("Последовательность >возрастает");
		}else {
			System.out.println("Последовательность <уменьшается ");
		}

	}

}
