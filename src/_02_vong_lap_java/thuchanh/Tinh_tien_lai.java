package _02_vong_lap_java.thuchanh;

import java.util.Scanner;

public class Tinh_tien_lai {
    public static void main(String[] args) {
        double money =1.0;
        int month =1;
        double lai=1.0;
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi");
        money=input.nextDouble();
        System.out.println("Nhập số tháng gửi");
        month =input.nextInt();
        System.out.println("Nhập % lãi xuất");
        lai =input.nextDouble();
        double tatol_interset=0;
        for(int i=0;i<month;i++){
            tatol_interset+=money*(lai/100)/12*month;
        }
        System.out.println("Total of interset: " + tatol_interset);
    }
}
