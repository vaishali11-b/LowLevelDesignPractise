package DesignPatterns.CreationalPatterns.FactoryDesign;
import DesignPatterns.CreationalPatterns.FactoryDesign.Shape;
import DesignPatterns.CreationalPatterns.FactoryDesign.Circle;
import DesignPatterns.CreationalPatterns.FactoryDesign.Rectangle;
import DesignPatterns.CreationalPatterns.FactoryDesign.Square;
public class ShapeInstanceFactory {
    //method to create shape instances based on the shape type , returns the shape object.
    //in futute any change in the logic of creating shape instance will be done here only, and it will not affect the client code.
    public Shape getShapeInstance(String value) {
    
        if (value.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (value.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (value.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
