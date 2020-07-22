package VolumeCalculator2;

public class RectangularPrisim{

    public int width;
    public int height;
    public int length;

    public RectangularPrisim(int width, int height, int length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getSurfaceArea(){
        return 2*(width*height + width*length + height*length);
    }

    public double getVolume(){
        return height*width*length;
    } 

    public String toString(){
        return "Rectangular Prisim: width " + width + " length " + length + " height " + height; 
    }
}