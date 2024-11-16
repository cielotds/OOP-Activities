class Rectangle extends Shape{
    double length;
    double width;
    
    public Rectangle(double length, double width, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString(){
        return "Rectangle" + "\nColor: " + color + "\nFilled: " + isFilled + "\nLength: " + length + "\nWidth: " + width;
    }
}
