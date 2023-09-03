class Area {
    double length;
    double breadth;

    void setDim(double length, double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    double getArea()
    {
        return length * breadth;
    }


    public static void main(String[] args)
    {
        Area rectangle = new Area();

        rectangle.setDim(5.0, 10.0);

        double area=rectangle.getArea();

        System.out.println("Area is " + area);
    }
}


