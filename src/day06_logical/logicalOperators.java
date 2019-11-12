package day06_logical;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		boolean res1=(i1==i2)&(c1==c2);  // F & T = F
		boolean res2=(i1==i2)&&(c1==c2); // F && ---- = F
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		
		boolean res3 = (c1==c2)|(i1==i2); // T | F = T
		boolean res4 = (c1==c2)||(i1==i2); // T || ------ = T
		
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
		boolean res5 = (c1==c2)^(i1==i2); // T ^ F = T
		boolean res6 = (c1==c2)^(i1!=i2); // T ^ T = f
		
		System.out.println("res5 = " + res5);
		System.out.println("res6 = " + res6);
		
		// task
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount; // true || ---> true;
		System.out.println(comp);
		
		
		
		// task
		String outsideWeather;
		int degree;
		outsideWeather = "Shinny";
		degree = 70;
		
		boolean comp2=(!(outsideWeather == "Rainy" || degree == 70));
		
		System.out.println(comp2);
		
		int b = 2;
		
		boolean res = ++b == 2 || --b == 2 && --b == 2; // 3==2 || 2 ==2 && 1==2
		System.out.println(res);
		
		// task
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10 )&& (z = false);
		
		System.out.println(x);
		System.out.println(z);
		
		// task
		double h1 = 20;
		double h2 = 80;
		
		double sum= (h1 + h2) * 25;
		
		double remain =sum % 40;
		
		System.out.println(remain + " remian is equal to 20 or less: " + (remain <=20) );
		
		
		
		int g=3, k=2;
		long c = (g+k) *2 / 3%2;
		System.out.println(c);
				





		

	}

}
