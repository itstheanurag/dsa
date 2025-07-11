package Basics;

public class Basics {
    public static void main(String[] args) {

        System.out.println(areaOfCicle(2));
        System.out.println(areadOfTriangle(4, 10));
        System.out.println(rectangle(2, 5));
    }

    static double areaOfCicle(int radius) {
        return Math.PI * (radius * radius);
    }

    static int areadOfTriangle(int base, int height) {
        return (base * height)/2;
    }

    static int rectangle(int base, int height) {
        return (base * height);
    }


}
