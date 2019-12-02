package day36_StaticClassMembers;

public class AllBlocksTest {

	public static void main(String[] args) {
		
		AllBlocks o1=new AllBlocks();
		
		AllBlocks o2=new AllBlocks();
		
		
		/*  result will be ;
		 * 
		 * first static init    // it will run one time only
           second static init   //  it will run one time only
           first instance init   // then instance block run based on the object creation
           second instance init  // then instance block run based on the object creation
           no argument constructor  // then it will run constructor
           first instance init    // instance block run based on the object creation. 
                                   //if you create 3time, it will print instance block every time before constructor
           second instance init    // instance block run based on the object creation. 
                                   //if you create 3time, it will print instance block every time before constructor
           no argument constructor
		 * 
		 */

	}

}
