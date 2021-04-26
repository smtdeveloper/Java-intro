package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("SMTcoder");
		//camelCase
		//Don't repeat yourself 
		String internetSubeBtn ="internet Þubesi";
		
		double dolorDun = 8.20;
		double dolorBugun = 8.20;
		int vade = 36;
		Boolean dolorCheck = false;
		
	//	System.out.println(internetSubeBtn);
		 
		
		if(dolorBugun<dolorDun) {
			System.out.println("Dolor düþtü ÝMG");
		}else if(dolorBugun==dolorDun) {
			System.out.println("Dolor Esit ÝMG");
		}else {
			System.out.println("Dolor Yükseldi ÝMG");
		}
		
		
		String kredi1 = "A Kredi";
		String kredi2 = "B Kredi";
		String kredi3 = "C Kredi";
		String kredi4 = "D Kredi";
		String[] krediler = {kredi1,kredi2,kredi3,kredi4};
		
		String[] krediler2 = {"a Kredi","b Kredi","c Kredi"};
		
	
		for (String kredi : krediler2) {
			System.out.println(kredi);
		}
		
		for (int i = 0; i < krediler2.length; i++) {
			System.out.println(krediler[0]);
		}
		
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5 };
		int[] sayilar2 = {10,20,30,40,50 };
		sayilar1 = sayilar2;
		sayilar2[0] =100;
		System.out.println(sayilar1[0]);
		 
		
		String city43 = "Kütahya";
		String city34 = "istanbul";
		city43 = city34;
		city34 = "Ankara";
		System.out.println(city43);
		
		System.err.println("SMTcoder");   
		System.err.println("Samet Akca");
	}
}
