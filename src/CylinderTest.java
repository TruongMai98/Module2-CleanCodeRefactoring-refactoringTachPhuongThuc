import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input radius");
        int radius = scanner.nextInt();
        System.out.println("input height");
        int height = scanner.nextInt();

        System.out.println(Cylinder.getVolume(radius, height));
    }
}
