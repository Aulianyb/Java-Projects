// ShapeFactory.java

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {
    // use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
      if (shapeType == null) {
       return null;
      }
      try {
       Class<?> shapeClass = Class.forName(shapeType);
       Object shapeObject = shapeClass.getDeclaredConstructor().newInstance();
       return (Shape) shapeObject;
      } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
        e.printStackTrace();
      }
      return null;
    }
   }