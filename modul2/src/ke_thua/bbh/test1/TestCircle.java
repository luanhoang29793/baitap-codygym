package ke_thua.bbh.test1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled("blue");
        System.out.println(" A circle " + circle.toString());
        System.out.println(" The radius is " + circle.getRadius());
        System.out.println("Circle Area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println();
    }
}
