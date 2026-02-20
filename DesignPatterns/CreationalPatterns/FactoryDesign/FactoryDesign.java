// Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It promotes loose coupling by eliminating the need to bind application-specific classes into the code. The client code interacts with the factory method, which creates the objects, rather than directly instantiating them.
// Uses: It is commonly used in scenarios where the exact type of object to be created is not known until runtime, such as in the case of creating objects based on user input, configuration files, or when working with complex object creation processes that involve multiple steps or dependencies.

// Example: A common
public class FactoryDesign {
    public static void main(String[] args) {
        
        ShapeInstanceFactory shapeFactory = new ShapeInstanceFactory();
        Shape shape1 = shapeFactory.getShapeInstance("CIRCLE");
        shape1.computeArea();
        
    }
    
}


//it is used when all the object creation and its business logic we need to keep at one place.