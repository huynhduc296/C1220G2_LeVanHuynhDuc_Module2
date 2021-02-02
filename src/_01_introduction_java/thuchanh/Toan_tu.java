package _01_introduction_java.thuchanh;
import java.util.Scanner;
public class Toan_tu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter width:");
        width=a.nextFloat();
        System.out.println("Enter width:");
        height= a.nextFloat();
        float area= width*height;
        System.out.println("Area is"+area);
    }
}
