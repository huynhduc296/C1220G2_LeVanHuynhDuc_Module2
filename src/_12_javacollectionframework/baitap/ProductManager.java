package _12_javacollectionframework.baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
    private List<Product>listproduct=new ArrayList<>();
    public void add(Product product){
        listproduct.add(product);
    }
    public Product delete(int id){
        for (int i=0;i<listproduct.size();i++){
            if(listproduct.get(i).getId()==id){
                return listproduct.remove(i);
            }
        }
        return null;
    }
    public Product edit(int id,Product product){
        for (int i=0;i<listproduct.size();i++){
            if(listproduct.get(i).getId()==id){
                listproduct.get(i).setId(product.getId());
                listproduct.get(i).setNameOfProduct(product.getNameOfProduct());
                listproduct.get(i).setCost(product.getCost());
                return listproduct.get(i);
            }
        }
        return null;
    }
    public Product search(String nameOfProduct){
        for (int i=0;i<listproduct.size();i++){
            if(listproduct.get(i).getNameOfProduct()==nameOfProduct){
                return listproduct.get(i);
            }
        }
        return null;
    }
    public void sort(){
        Collections.sort(listproduct,new SortCostProduct());
    }
    public void disPlay(){
        for (Product product:listproduct){
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        ProductManager list=new ProductManager();
        list.add(new Product(1,"name1",50));
        list.add(new Product(2,"name2",20));
        list.add(new Product(3,"name3",30));
        list.add(new Product(4,"name4",40));
        list.disPlay();
        System.out.println("-------delete-------");
        list.delete(2);
        list.disPlay();
        System.out.println("-------edit-----");
        Product product=new Product(10,"ten10",20);
        list.edit(3,product);
        list.disPlay();
        System.out.println("-------search-------");
        System.out.println(list.search("name1"));
        System.out.println("-------sort---------");
        list.sort();
        list.disPlay();
    }
}
