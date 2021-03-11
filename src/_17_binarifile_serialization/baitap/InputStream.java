package _17_binarifile_serialization.baitap;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;


public class InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\src\\_17_binarifile_serialization\\baitap\\test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> list = (List<Product>) ois.readObject();
            for (Product s : list) {
                System.out.println(s.toString());
            }
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }
}
