package VolumeCalculator2;

public class TestCalculator{

    public static void main(String[] args){
        Sphere sp = new Sphere(3);
        Sphere sp2 = new Sphere(4);
        RectangularPrisim rp = new RectangularPrisim(1, 2, 3);

        System.out.println(sp.toString() + " SA: " + sp.getSurfaceArea() + " V: " + sp.getVolume());
        System.out.println(sp2.toString() + " SA: " + sp2.getSurfaceArea() + " V: " + sp2.getVolume());
        System.out.println(rp.toString() + " SA: " + rp.getSurfaceArea() + " V: " + rp.getVolume());
    }
}