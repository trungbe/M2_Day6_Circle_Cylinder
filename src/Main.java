import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area circle" + circle.getArea());
        System.out.println(circle);

        System.out.println("------------------------------");
        Cylinder cylinder = new Cylinder(6,"black",7);
        System.out.println(cylinder.getHeight());
        System.out.println("Volume cylinder" + cylinder.getVolume());
        System.out.println(cylinder);
    }
}
