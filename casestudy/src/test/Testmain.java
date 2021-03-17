package test;

import file.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class Testmain {
    public static void main(String[] args) {
        Studens studens = new Studens();
        studens.setId("1");
        studens.setAge("2");
        studens.setName("duc");
        System.out.println(studens.toString());
        System.out.println(studens.showinfor());
        Studens studens1 = new Studens("1", "duc", "1");
        studens.setId("18");

        String line = studens.getId() + "," + studens.getName() + "," + studens.getAge();
        //  FileUtils.writeFile("D:\\casestudy\\src\\test\\teststuden.csv",line);
        List<String> stringList = FileUtils.readerFile("D:\\casestudy\\src\\test\\teststuden.csv");
        //tạo một List generic String tên stringlist =  { "1,duc,18" , "2,duc,20"  }
        List<Studens> studensList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            String[] linesplike = stringList.get(i).split(","); //linesplit = [1 duc 18]
            Studens studens2 = new Studens(linesplike[0], linesplike[1], linesplike[2]);
            studensList.add(studens2);
        }
        System.out.println(studensList);

    }
}
