package FactoryMethod;
public abstract class ShapeFactory {
    public abstract Shape createShape();
    public void drawshape(){
        Shape shape=createShape();
        shape.draw();
    }
}
