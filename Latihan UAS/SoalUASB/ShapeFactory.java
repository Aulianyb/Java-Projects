package SoalUASB;
import java.lang.reflect.*;;


public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null; 
        } else{
            try{
                return (Shape) Class.forName(shapeType).getConstructor().newInstance(); 
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return null; 
    }
}
