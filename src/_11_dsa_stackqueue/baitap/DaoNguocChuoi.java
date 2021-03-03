package _11_dsa_stackqueue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string=scanner.nextLine();
        Stack<Character> myStack=new Stack<>();
        for (int i = 0; i <string.length() ; i++) {
            myStack.push(string.charAt(i));
        }
        for (int i = myStack.size()-1; i>=0 ; i--) {
            System.out.print(myStack.get(i));
        }
    }
}
