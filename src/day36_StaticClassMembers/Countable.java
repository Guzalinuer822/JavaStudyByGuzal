package day36_StaticClassMembers;

public class Countable {

	int instanceCount=0;  // this is instance variable, belong to object.
	                      // if put static, it will belong to class
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
}
