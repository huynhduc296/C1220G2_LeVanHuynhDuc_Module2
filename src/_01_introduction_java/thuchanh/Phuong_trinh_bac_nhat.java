package _01_introduction_java.thuchanh;
import java.util.Scanner;

public class Phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner a=new Scanner(System.in);
        System.out.println("a: ");
        double b=a.nextDouble();
        System.out.println("b: ");
        double c=a.nextDouble();
        System.out.println("c: ");
        double d=a.nextDouble();
        if(b!=0){
            double solution =-c/b;
            System.out.printf("The solution is:%f!",solution);
        }
        if(b!=0){
            double answer =(c-d)/b;
            System.out.printf("Equation pass with x = %f!\n",answer);
            }else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}

