package bai_tap.ve_tinhdien3hinh;

public class Square {
   public double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return Math.pow(side,2);
    }

    public void draw() {
        for (int i = 0; i < side ; i++) {
            for (int j = 0; j < side ; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
