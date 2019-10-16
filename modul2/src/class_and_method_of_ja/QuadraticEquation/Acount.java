package class_and_method_of_ja.QuadraticEquation;

public class Acount {
    double a, b, c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Acount() {
    }

    public Acount(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }
    public double getRoot1() {
        double root1;
        double delta = getDiscriminant();
        root1 = (-b + (double)(Math.pow(delta,0.5))/(2*a));
        return root1;
    }
    public double getRoot2() {
        double root2;
        double delta = getDiscriminant();
        root2 =   (-b - (double)(Math.pow(delta,0.5))/(2*a));

        return root2;
    }
}

