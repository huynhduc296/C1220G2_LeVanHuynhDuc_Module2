package _01_introduction_java.thuchanh;

import java.util.Scanner;

public class Ngay_trong_thang {

    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Số tháng nào bạn muốn đếm ngày");
        int month=number.nextInt();
//        switch (month) {
//            case 2:
//                System.out.print("tháng '2' có 28 dến 29 ngày!");
//                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.print("tháng'" + month + "' có 31 ngày!");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.print("tháng '" + month + "' có 30 ngày");
//                break;
//            default:
//                System.out.print("Invalid input!");
//                break;
//        }
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (daysInMonth != "") System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
        }
    }
