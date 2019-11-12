package day30_wrapperClass;

public class varArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(2, 4);
		
		concat("apple", "orange", "123");
		
	}


	
	public static void sum(int... numbers) {
		
		int sum=0;
		for(int value:numbers) {
			sum=sum+value;
		}
		System.out.println(sum);
	}
	
	public static void concat(String...strs) {
		String newStr="";
		
		for(String str:strs) {
			newStr=newStr+str.charAt(2);
		}
		System.out.println(newStr);
	}
}
