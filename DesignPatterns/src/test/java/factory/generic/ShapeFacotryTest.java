package factory.generic;


import org.junit.Test;
import factory.Shape;
import factory.simple.ShapeType;

public class ShapeFacotryTest {
    @Test
    public void create() throws Exception {
        ShapeFacotry sf = new ShapeFacotry();

        Shape shape = sf.create(ShapeType.RECTANGLE);
        System.out.println(sf.toString());
    }

}