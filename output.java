package Shape;

import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Rectangle\n2.Circle");
        String pilihan = s.nextLine();
        if (pilihan.equalsIgnoreCase("1")) {
            System.out.println("Cube\n(yes/no)");
            String input = s.nextLine();
            if (input.equalsIgnoreCase("no")) {
                System.out.println("--Rectangle--");
                System.out.println("Name :");
                String name = s.nextLine();
                System.out.println("Color :");
                String color = s.nextLine();
                System.out.println("Length :");
                int length = s.nextInt();
                System.out.println("Width :");
                int width = s.nextInt();
                int calculate = length * width;
                rectangle a = new rectangle(name, color, length, width);
                a.print();
                System.out.println("Area of Rectangle :"+calculate);
            }else if (input.equalsIgnoreCase("yes")) {
                System.out.println("--Cube--");
                System.out.println("Name :");
                String name = s.nextLine();
                System.out.println("Color :");
                String color = s.nextLine();
                System.out.println("Length :");
                int length = s.nextInt();
                System.out.println("Width :");
                int width = s.nextInt();
                System.out.println("Height :");
                int height = s.nextInt();
                int calculate = 2 * (length * width + length * height + width * height);
                cube b = new cube(name, color, length, width, height);
                b.print();
                System.out.println("Surface Area of Cube :"+calculate);
            }
        }else if (pilihan.equalsIgnoreCase("2")) {
            System.out.println("--Circle--");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Radius :");
            int radius = s.nextInt();
            double calculate = Math.PI * radius * radius;
            circle c =  new circle(name, color, radius);
            c.print();
            System.out.println("Area of Circle :"+calculate);
        }else{
            System.out.println("Category not Available");
        }
        s.close();
    }
}
