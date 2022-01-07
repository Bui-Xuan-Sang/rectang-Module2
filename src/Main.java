import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        rectangle.setHeight(input.nextDouble());
        System.out.println("Nhập chiều rộng: ");
        rectangle.setWidth(input.nextDouble());
        System.out.println(rectangle.display());
        double area = rectangle.getArea();
        System.out.println("Diện tích: " + area);
        System.out.println("Chu vi: " + rectangle.getPerimeter());
    }
}
