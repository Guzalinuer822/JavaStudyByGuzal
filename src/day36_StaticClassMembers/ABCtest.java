package day36_StaticClassMembers;

public class ABCtest {

	public static void main(String[] args) {
		
		// to call m1() , i have two ways
		//1.by class name
		ABC.m1();
		//2. by creating object then call
		ABC o1=new ABC();
		o1.m1();
		
		// call method through only static way
		// have to modify  constructor to private ---> private ABC(){}
		// the constructor is private , you only can call by class not by creating object
		// because if constructor is private it will not allow you to do create an object
		
		// whenever all of your methods in your class are static, and you want everyone to call them
		// static way -->Classname.method();  , then you can make your constructor private;

	}

}
