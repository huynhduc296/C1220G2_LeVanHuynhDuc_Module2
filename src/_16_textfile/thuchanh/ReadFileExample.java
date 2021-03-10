package _16_textfile.thuchanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText( ){
        try {
            File file=new File("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\src\\_16_textfile\\thuchanh\\filePath.csv");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong"+sum);
        }catch (Exception e){
            System.out.println("File không tồn tại or nội dung lỗi");
        }
    }

    public static void main(String[] args) {

        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText();
    }
}
