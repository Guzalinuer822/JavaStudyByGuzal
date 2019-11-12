package day15_methodOverloading;

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(15, 52, 45));
		int x= sum(25, 56);
		System.out.println(x);

	}
	
	public static int sum(int a, int b) {return a+b;}
	
	public static int sum(int a, int b, int c) {return a+b+c;} // can not use same 2 data type ,if u use same method name.
	
	

}


/* 1. number of parameter
 *       add (int, int)
 *       add (int, int, int)
 *       
 * 2. data type of parameter
 * 
 *       add(int, int)
 *       add (int, float)
 *       
 *  3. sequence of data type parameter
 *       add(int, float)
 *       add (float, int)  ---- look at the order
 *       
 *  4. invalid case =====not overloading
 *  
 *       int add(int, int )
 *       float add(int, int)
 *  
 */
   





