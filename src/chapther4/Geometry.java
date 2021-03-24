package chapther4;

import java.util.Scanner;

public class Geometry {
    /* 4.4 Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula (s is the length of a side):
≤*/
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = scanner.nextDouble();

        double area=(6*side*side)/(4*(Math.tan(Math.PI/6)));
        System.out.println("The area of the hexagon is "+area);
    }

}
