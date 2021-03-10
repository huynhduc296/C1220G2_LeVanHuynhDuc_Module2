package oop;

import java.util.Scanner;

public class TestCustomException1 {
    static void validate(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("not validate");
        }else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try {
                System.out.println("Nhập số");
                String input=scanner.nextLine();
                validate(Integer.parseInt(input));
                break;
            } catch (InvalidAgeException e) {
                System.out.println("Exception occured: "+ e);
            }catch (Exception m){
                System.out.println("Lỗi nhập");
            }
        }
    }
}
