package _10_dsa_danhsach.baitap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListIntager=new MyList<Integer>();
        ListIntager.add(1,6);
        ListIntager.add(2,7);
        ListIntager.add(3,8);
        ListIntager.add(4,8);
        ListIntager.add(5,9);
        System.out.println("element 1:"+ListIntager.get(1));
        System.out.println("element 2:"+ListIntager.get(2));
        System.out.println("element 5:"+ListIntager.get(4));
            ListIntager.remove(2);
            ListIntager.disPlay();
    }
}
