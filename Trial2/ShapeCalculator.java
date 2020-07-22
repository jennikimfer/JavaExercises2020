public class ShapeCalculator{
    public static void main(String[] args){
        // radius --> circumference and area 
        // PI = 3.14
        double pi = 3.14;
        double radius = 5.5;
        double circum = 2*pi*radius;
        double areaC = pi*radius*radius;

        System.out.println("The circumference is " + circum + " and the area is " + areaC + " of a circle with radius " + radius);

        // width and height --> area of a rectangle
        double width = 3.5;
        double height = 4.5;
        double perim = 2*(width+height);
        double areaR = width*height;

        System.out.println("The perimeter is " + perim + " and the area is " + areaR + " of a rectangle with width " + width + 
            " and height " + height);

    }
}