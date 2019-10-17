package bai_tap.ve_tinhdien3hinh;

public class shap1 {
    private Square square;
    private Circle circle;
    private Rectangle rectangle;

    public shap1(Square square, Circle circle, Rectangle rectangle) {
      this.square =square;
      this.rectangle =rectangle;
      this.circle =circle;
    }
    public void setSquare(double size) {
        this.square.setSide(size);
    }
    public void setCircle (double radius) {
        this.circle.setRadius(radius);
    }
    public void setRectangle(double width, double height) {
        this.rectangle.setHeight(height);
        this.rectangle.setWidth(width);
    }
    @Override
    public String toString() {
        String circle1 = " dien tich hinh tron la"+ circle.getArea()+ "\n";
        String rectangle1 = " dien tich hinh tron la"+ rectangle.getArea()+ "\n";
        String square1 = " dien tich hinh tron la"+ square.getArea()+ "\n";
    return circle1 + square1 + rectangle1;
    }
    public void draw() {
        System.out.println("ve hinh tron");
        circle.draw();
        System.out.println("ve hinh vuong");
        square.draw();
        System.out.println("ve hinh chu nhat");
        rectangle.draw();
    }
}
