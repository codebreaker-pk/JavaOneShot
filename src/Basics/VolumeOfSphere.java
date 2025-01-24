package Basics;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double r = 5.6;
        double v = (4 * 3.141592 * r * r * r) / 3; // Volume of sphere = 4/3 π r³
        System.out.println("volume of sphere with radius " + r + " is " + v);
    }
}
