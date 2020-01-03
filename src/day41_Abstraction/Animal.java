package day41_Abstraction;

public abstract class Animal {
	
	public abstract void eat();  // this is abstract method
	
	public abstract void breath();  // this is abstract method
	
	public void move() {  // this is instance method
		System.out.println("moving");
	}
}


/*

An abstract class is an incomplete template for an object, one that already 
contains executable code.

An interface is a template that describes a subset of the required code, 
one that can be shared between otherwise incompatible classes. 

Traditionally, for technical reasons, interfaces have not been allowed to 
have any executable code in them, which is why abstract classes exist.

Consider this example:

interface I {
    doA();
    doB();
}

abstract class A implements I {
   doA() { System.out.println("A"); doB();}
}

class C1 extends A {
   doB() {System.out.println("C1");}
}

class C2 extends A {
   doB() {System.out.println("C2");}
}


The benefit of the Abstract class A, is that doA() only has to be 
written one time.  If you didn't have the abstract class, you would 
have to copy and paste doA() into each class that implements the interface.

Whether abstract classes are an advantage depends on whether 
the code, doA(), is going to be different in each class, or 
whether you want to be able to change it in a single location.

Because you can implement multiple interfaces, but only extend 
one class, there are many cases where you can't use an abstract 
class, but there are other comparable alternatives.

Mix-ins are essentially interfaces that allow default code.  
This requires language support, which isn't always present.

A more general purpose approach is simply encapsulation.

Using your Cars and Trains example, both objects would have 
a property, lets call it TransportationDescriptor, which 
provides the necessary info to complete all Transportation 
methods.  The TransportationDescriptor implements transportation 
and can be provided as a property, or Car and Train can implement 
Transportation directly and forward the method calls to the descriptor. 

This kind of descriptor property encapsulation is also very conducive 
to Dependency Injection, where properties are automatically set based 
on system properties, configuration files, and code structure ( e.g.  
Transporation.type = Car.class.getClassName(); )
 
*/