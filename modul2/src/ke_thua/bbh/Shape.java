package ke_thua.bbh;

public class Shape {
    private String color = "green";
    private boolean filled = true ;

    public Shape() {
    }
    public Shape (String color, boolean filled) {
        this.color =color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        return  "A shape with color of "
                + getColor()
                + " and " + (isFilled()? "filled": "not filled");
    }
}
