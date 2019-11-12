package day15_methodOverloading;

public class task69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int number = 3;
		
		if(isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}

	}
	
	
	public static boolean isPrime(int number) {
		
		boolean  flag = true;
		
		if(number==0 || number ==1) {
			
			flag=false;
			
		}else {
			
			
			for(int i=2;i<number;i++) {
				
				if(number%i==0) {
					
					flag=false;
					
					break;
				}
				
			}
			
		
		}
		
		return flag;


	}

}
