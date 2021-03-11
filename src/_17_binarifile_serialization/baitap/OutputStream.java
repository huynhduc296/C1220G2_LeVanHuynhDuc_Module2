package _17_binarifile_serialization.baitap;

import com.sun.deploy.net.MessageHeader;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutputStream {

    public static void main(String[] args) {
        try {
            FileOutputStream fos =new FileOutputStream("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\src\\_17_binarifile_serialization\\baitap\\test.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(addnew());
        fos.close();
        oos.close();
        }catch (Exception ex){
            System.out.println("Loi ghi file: \" + ex");
        }
    }
    public static List addnew(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã của sản phẩm");
        String idProduct=scanner.nextLine();
        System.out.println("Nhập Tên sản phẩm");
        String nameProduct=scanner.nextLine();
        System.out.println("Hãng sản xuất");
        String theFirmProduct=scanner.nextLine();
        System.out.println("Nhập giá");
        String priceProduct=scanner.nextLine();
        List<Product> list=new ArrayList<>();
        list.add(new Product(idProduct,nameProduct,theFirmProduct,priceProduct));
        return list;
    }
}
