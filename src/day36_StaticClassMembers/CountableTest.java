package day36_StaticClassMembers;

public class CountableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int objectCount;

Countable obj1=new Countable();
Countable obj2=new Countable();
Countable obj3=new Countable();

objectCount=obj1.getInstanceCount();

System.out.println(objectCount);


	}

}
