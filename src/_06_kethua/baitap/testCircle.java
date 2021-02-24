package _06_kethua.baitap;

public class testCircle {
    public static void main(String[] args) {
        Circle cylinder=new Cylinder();
        System.out.println(cylinder.display());
        cylinder=new Cylinder(2,"blue",true,1);
        System.out.println(cylinder.display());
    }
}