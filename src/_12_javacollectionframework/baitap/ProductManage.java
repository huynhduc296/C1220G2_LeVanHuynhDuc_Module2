package _12_javacollectionframework.baitap;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    public static void add(List<Product>list){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập tên");
        String name= scanner.nextLine();
        System.out.print("Nhập id");
        int id= scanner.nextInt();
        System.out.print("Nhập gia");
        int gia= scanner.nextInt();
        Product product=new Product(id,name,gia);
        list.add(product);
    }
    public static void display(List<Product>list){
        for (Product product:list
             ) {
            System.out.println(product);
        }
    }
    public static void delete(List<Product>list){
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập id sản phẩm bạn muốn xóa");
        int id= scanner.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()== id){
                list.remove(i);
            }
        }
    }
    public static void edit(List<Product>list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm bạn muốn sửa");
        String name=scanner.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getNameOfProduct().equals(name)){
                System.out.println("Ban muốn sửa \n"+
                        "1 id \n"+
                        "2 name \n"+
                        "3 giá \n");
                System.out.println("Nhập lựa chọn bạn muốn sửa");
                int choice=scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("nhập id mới");
                        int idnew=scanner.nextInt();
                        list.get(i).setId(idnew);
                        break;
                    case 2:
                        System.out.println("nhập tên mới");
                        String name1=scanner.nextLine();
                        list.get(i).setNameOfProduct(name1);
                        break;
                    case 3:
                        System.out.println("nhập giá mới");
                        int cost=scanner.nextInt();
                        list.get(i).setCost(cost);
                        break;
                }
            }
        }
    }
    public static void search(List<Product>list){
       Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn tìm");
            String name=scanner.nextLine();
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNameOfProduct().equals(name)){
                    System.out.println(list.get(i));
                }
            }

    }
    public static void sort(List<Product>list){
        Collections.sort(list,new SortCostProduct());
    }

}
