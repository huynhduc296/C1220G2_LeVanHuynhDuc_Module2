package _02_vong_lap_java.baitap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hien_thi {
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4. Exit");
        menu = input.nextInt();
        switch (menu) {
            case 1:
                int n = 3;
                int m = 7;
                for (int i = 1; i <= n; i++) {
                    for (int k = 1; k <= m; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("chon:");
                int chon = input.nextInt();
                switch (chon) {
                    case 1:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 5; i++) {
                            for (int l = 1; l <= 5; l++) {
                                if (l < i) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print("*");
                                }
                            }
                            System.out.println("");
                        }
                        break;

                    case 3:
                        for (int i = 7; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 5:
                        for (int i = 5; i >= 0; i--) {
                            for (int l = 5; l >= 0; l--) {
                                if (l > (5 - i)) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print("*");
                                }
                            }
                            System.out.println("");
                            break;
                        }
                }
            case 3:
                for (int r = 0; r <= 5; r++) {
                    for (int a = 5 - r + 1; a >= 1; a--) {
                        System.out.print(" ");
                    }
                    for (int c = 1; c <= r; c++) {
                        System.out.print("*");
                    }
                    for (int c = r - 1; c >= 1; c--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}


