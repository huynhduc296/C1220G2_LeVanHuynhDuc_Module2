package _11_dsa_stackqueue.baitap;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocptMang<T> {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();

        System.out.println("Nhập số phần tư muốn nhập");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            myStack.push(scanner.nextInt());
        }

        List<Integer> myArray = new ArrayList<>();
        while (!myStack.isEmpty()) {
            int number = myStack.pop();
            myArray.add(number);
        }
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }

    }
}
