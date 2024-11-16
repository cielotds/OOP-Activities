class Square extends Shape {
    double side;

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double getArea(){
        return side * side;
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

    @Override
    public String toString(){
        return "Square:" + "\nColor: " + color + "\nFilled: " + isFilled + "\nSide: " + side; 
    }

}
