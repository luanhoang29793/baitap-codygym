package bai_tap.ve_tinhdien3hinh;
public class Rectangle {
    public double width;
    public double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.width *this.height;
    }
    public void draw(){
        for (int i=0; i<this.height; i++){
            for (int j=0; j<this.width; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
