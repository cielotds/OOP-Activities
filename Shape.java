abstract class Shape {    
    protected String color;
    protected boolean isFilled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.isFilled = filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean isFilled){
        this.isFilled = isFilled;
    }

    public boolean isFilled(){
        return isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
        return "Color: " + color + "\nFilled: " + isFilled;
    }
}
