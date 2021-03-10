package _12_javacollectionframework.baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> list =new ArrayList<>();
        list.add(new Product(1,"name1",50));
        list.add(new Product(2,"name2",20));
        list.add(new Product(3,"name3",30));
        list.add(new Product(4,"name4",40));
        boolean check=true;

while (check) {
    System.out.println("Menu :\n" +
            "1.Thêm sản phẩm \n" +
            "2.Hiển thị sản phẩm \n" +
            "3.Xóa sản phẩm \n" +
            "4.Sửa sản phẩm \n" +
            "5.Tìm sản phẩm \n" +
            "6.Sắp xếp sản phẩm \n" +
            "7.Thoát \n"
    );
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập lựa chọn nếu bạn muốn");
    String choice1 = scanner.nextLine();
    char choice;
    if(choice1.length() == 1){
         choice=choice1.charAt(0);
    }else {
        choice='a';
    }

    switch (choice) {
        case '1':
            ProductManage.add(list);
            break;
        case '2':
            ProductManage.display(list);
            break;
        case '3':
            ProductManage.delete(list);
            ProductManage.display(list);
            break;
        case '4':
            ProductManage.edit(list);
            break;
        case '5':
            ProductManage.search(list);
            break;
        case '6':
            ProductManage.sort(list);
            ProductManage.display(list);
            break;
        case '7':
            check=false;
            break;
        default:
            break;
         }
      }
    }
}
