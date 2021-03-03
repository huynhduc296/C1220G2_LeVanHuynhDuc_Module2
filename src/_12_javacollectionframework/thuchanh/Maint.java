package _12_javacollectionframework.thuchanh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maint{
    public static void main(String[] args) {
        Studen studen = new Studen("Kien", 30, "HT");
        Studen studen1 = new Studen("Nam", 26, "HN");
        Studen studen2 = new Studen("Anh", 38, "HT" );
        Studen studen3 = new Studen("Tung", 38, "HT" );

        List<Studen> lists = new ArrayList<Studen>();
        lists.add(studen);
        lists.add(studen1);
        lists.add(studen2);
        lists.add(studen3);
        Collections.sort(lists);
        for(Studen st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Studen st : lists){
            System.out.println(st.toString());
        }
    }
}