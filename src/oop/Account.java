package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private String idCard;
    private String nameCard;
    private double money;
    private final double rateMoney = 0.035;
    public static List<Account> listAccount = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Account(String idCard, String nameCard) {
        this.idCard = idCard;
        this.nameCard = nameCard;
        this.money = 50;
        listAccount.add(this);
    }

    public Account() {
        listAccount.add(this);
    }

    public Account(String idCard, String nameCard, double money) {
        this.idCard = idCard;
        this.nameCard = nameCard;
        this.money = money;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    void validate(double moneyOut) throws InvalidAgeException {
        if (moneyOut < 0) {
            throw new InvalidAgeException("not validate");
        } else if (moneyOut > this.money) {
            throw new InvalidAgeException("số tiền trong tk bạn k dủ" +
                    "\n tk của bạn có: " + this.money +
                    "\n hãy nhập lại số tiền muốn rút");
        } else {
            System.out.println("bạn đã rút tiền thành công +TK của bạn còn");
            System.out.println(this.money-moneyOut);
        }

    }

    public double payOutCard() {
        String moneyOut;
        while (true) {
            try {
                System.out.println("Nhập số tiền bạn muốn rút");
                moneyOut = scanner.nextLine();
                validate(Double.parseDouble(moneyOut));
                break;
            } catch (InvalidAgeException e) {
                System.out.println(e);

            } catch (Exception m) {
                System.out.println("Nhập lỗi");
            }

        }
         this.money -=Double.parseDouble(moneyOut);
        return Double.parseDouble(moneyOut);
    }

    public static void main(String[] args) {
        Account account=new Account("1","duc",500);
        listAccount.add(account);
        account.payOutCard();
    }
    public double maturity() {
        return this.money += this.money * rateMoney;
    }


}
