package factory.generic;

import factory.Circle;
import factory.Rectangle;
import factory.Shape;
import factory.Square;
import factory.simple.ShapeType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFacotry implements Factory<ShapeType, Shape> {

    private Map<ShapeType, Supplier<Shape>> map = new EnumMap<>(ShapeType.class);

    public ShapeFacotry() {
        map.put(ShapeType.CIRCLE, Circle::new);
        map.put(ShapeType.RECTANGLE, Rectangle::new);
        map.put(ShapeType.SQUARE, Square::new);
    }

    @Override
    public Shape create(ShapeType key) {
        Supplier<Shape> shapeSupplier = map.get(key);
        Shape shape = shapeSupplier.get();

        return map.containsKey(key) ? map.get(key).get() : null;
    }
}
