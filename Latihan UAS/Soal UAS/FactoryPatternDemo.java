import SoalUASB.Shape;
import SoalUASB.ShapeFactory;
import java.lang.reflect.*;


public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory(); 
        // Shape shape1 = shapeFactory.getShape("Circle"); 
        // shape1.draw();
        // Shape shape2 = shapeFactory.getShape("Rectangle"); 
        // shape1.draw();
        // Shape shape3 = shapeFactory.getShape("Square"); 
        // shape1.draw();

        Field[] facttoryFields = shapeFactory.getClass().getDeclaredFields(); 
    }
}
