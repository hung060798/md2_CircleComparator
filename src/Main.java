import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "blue", false);

        System.out.println("pre-sorted:");
        for (Circle cir: circles){
            System.out.println(cir);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("after- sorted:");
        for (Circle cir: circles) {
            System.out.println(cir);
        }
    }
}
