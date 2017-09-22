package factory.simple;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;

public class SimpleFactory {
    public Shape getShape(String name){
        if(name.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(name.equalsIgnoreCase("RECTAGLE")){
            return new Rectangle();
        }else if(name.equalsIgnoreCase("SQUARE")){
            return new Circle();
        }
        return null;
    }

    public Shape getShape(ShapeType shapeType){
        if(shapeType == ShapeType.CIRCLE){
            return new Circle();
        }else if(shapeType == ShapeType.RECTANGLE){
            return new Rectangle();
        }else if(shapeType == ShapeType.SQUARE){
            return new Circle();
        }
        return null;
    }
}
