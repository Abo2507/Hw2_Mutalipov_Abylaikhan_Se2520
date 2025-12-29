# Hw2_Mutalipov_Abylaikhan_Se2520

A.PROJECT OVERVIEW


A Vehicle Management System is a software tool. It helps monitor, manage, and improve how a fleet of vehicles operates. In this software it shows driver license, vehicle description.

When an is-a relationship exists between objects, it means that the specialized 
object has all the characteristics of the general object, plus additional 
characteristics that make it special. I

Use Inheritance for a strong hierarchy when types share identity and behavior. 
Use Composition when you want flexibility and separation of concerns.
Use Abstraction to enforce contracts and enable extensibility without tight coupling.


B. Class Hierarchy 
In Java terminology, a class C1 extended from another class C2 is called a subclass, and C2 is called a superclass. A superclass is also referred to as a parent class or a base class, and a subclass as a child class, an extended class, or a derived class.

In simple words: 
Superclass is a parent class, while subclasses are chid classes which connected by kew word extends.


 Whenever subclass needs specific implementation of superclass method, it can 
override this method with its own implementation,  So, subclass will have its own implementation, different from superclass version.
Optional @Override annotation to indicate that the following method declaration 
(i.e., toString) should override an existing superclass method.


▪ It’s a compilation error to override a method with a more restricted access modifier

▪ E.g., public method cannot become protected in an override version, which is vaijlid 
in reverse

▪ It is NOT possible to override private or static methods in Java

▪ A superclass’s protected members are accessible by all subclasses of that 
superclass and other classes in the same package.


C. Instructions to Compile and Run 
Open Intellij, add this project and go to the main class, then click the run button.


E. Reflection Section 
the Vehicle superclass. Instead of redefining fields like brand and year or the displayInfo() method in every class, they are inherited by Car, Motorcycle, and Truck .
It allows me to save time during program 
development by basing new classes on existing 
proven and debugged high-quality software. 

Method overriding allowed each subclass to provide a specific implementation for the abstract startEngine() and stopEngine() methods defined in the superclass. While every vehicle "starts," the actual behavior is different: a Car might "ignite the engine with a key," while a Motorcycle might "kickstart the engine". Overriding ensures that when the loop calls startEngine(), the program executes the version of the method specific to that object's actual type.


One of the primary challenges with protected access is maintaining strict encapsulation; while it allows subclasses to access fields directly, it also opens those fields to any class within the same package, which can lead to unintended side effects.


