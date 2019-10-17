package bai_tap.ve_tinhdien3hinh;

public class Circle {
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadiusSquare(){
        return this.radius *this.radius;
    }
    public double getArea() {
        return getRadiusSquare()*Math.PI;
    }
    public void draw() {
        double check;
        double radiusSquare = this.getRadiusSquare();
        long limit = Math.round(radius) + 1;
        for (long i=-limit; i<limit; i++){
            for (long j=-limit; j<limit; j++){
                check = Math.pow(i,2) + Math.pow(j,2);
                if (check <= radiusSquare)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}



