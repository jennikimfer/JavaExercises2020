package VolumeCalculator2;

public class Sphere{

    public int radius;

    public Sphere(int radius){
        this.radius = radius;
    }

    public double getSurfaceArea(){
        return 4*Math.PI*radius*radius;
    }

    public double getVolume(){
        return 4*Math.PI*radius*radius*radius/3;
    }

    public String toString(){
        return "Sphere: radius " + radius;
    }

}