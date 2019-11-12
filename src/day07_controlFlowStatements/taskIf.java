package day07_controlFlowStatements;

public class taskIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
		int x,y;
		x=0;
		y=20;
		
		if (y==20) {
			x = 5;
			
		}
		
		System.out.println("x = " + x + "  " + "y= "+ y);
		
		
		//2.
		double payRate,hour;
		payRate = 1000;
		hour = 35;
		if(hour> 40) {
			payRate = 1.5*payRate;
		}
		System.out.println("payrate is " + payRate);
		
		
		//3.
		
		boolean max = true;
		int fee = 20;
		
		if (max == true) {
			fee = 50;
			
		                 }
		
		
		System.out.println("fee is " + fee);	
		
		
		
		//4.
		
		
		int a,b,c;
		a=100;
		b=20;
		c=10;
		
		if (b ==50 && c >= 100) {
			a=20;
			
		}
		
		System.out.println("a= " + a);

		
		
		//5.
		
		int temp;
		temp = 62;
		
		if (temp>70 && temp <80 ) {
			System.out.println("Ideal Temp");
			
		}
		
		System.out.println("Not Ideal");
		
		//task_24
		
		int age;
		age = 20;
		
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		}
		
		// task_25
		
		int h,i,j;
		h=10;
		i=78;
		j=25;
		
			
		if (h > i && h > j) {
			      System.out.println("First number is greatest.");}
		if (i > h && i > j) {
			      System.out.println("Second number is greatest.");}
	    if (j > h && j > i) {
			      System.out.println("Third number is greatest.");}
		
		// task_26
	    
	    int num1, num2;
	    num1 = 5;
	    num2 = 56;
	    
	    if(num1==num2) {
	    	System.out.println("num1 " + num1 + " is equal to num2 " + num2);}
	    if (num1!= num2) {
	    	System.out.println("num1 " + num1 + " is not equal to num2 " + num2);}
		
	    //task_27
	    
	    int hour1;
	    hour1=13;
	    if(hour1<12) {System.out.println("good morning");}
	    if (hour1>=12 && hour1<15) {System.out.println("good afternoon");}
	    if (hour1>= 15) {System.out.println("good evening");}
	    
	    // task_28
	    
	    double revenue, price, quantity, discount;
	    price = 1000;
	    quantity = 5;
	    
	    revenue = price * quantity;
	    
	    discount = price - price*0.1 ;
	    
	    System.out.println("product price= " + price + ", quantity = " + quantity);
	    
	    if (revenue>=5000) {System.out.println(" we will give you  10 % discount. It will be " + discount );}
	    
	    if (revenue <5000) {System.out.println(" Sorry , no discount.");}
	    }
	    
	}


