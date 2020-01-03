package day44_exceptiondAndError;

public class OrCatchBlock {

	public static void main(String[] args) {
		
		String str="abc";
		
		try {
			System.out.println(str.charAt(10));
			
			String str2=null;
			System.out.println(str2.toUpperCase());
		}catch(IllegalArgumentException | NullPointerException e) {
			//Exception types cannot be sub-parent type, have to be sibling with same parent
			
			System.out.println("Exception happend: " +e.getClass().getSimpleName());
		}

	}

}
