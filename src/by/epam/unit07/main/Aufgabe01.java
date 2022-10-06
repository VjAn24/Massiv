package by.epam.unit07.main;

public class Aufgabe01 {

	public static void main(String[] args) {
		int n=10, k=4;
		int[] mas=new int[n];
		mas[0]=545;
		mas[1]=528;
		mas[2]=8489;
		mas[3]=656;
		mas[4]=48;
		mas[5]=8489;
		mas[6]=44;
		mas[7]=844;
		mas[8]=56;
		mas[9]=568;
		for (int i=0; i<mas.length; i++) {
			if(mas[i]%k==0) {
				System.out.println(mas[i]+"кратно"+k);
			}
		}
		

	}

}
