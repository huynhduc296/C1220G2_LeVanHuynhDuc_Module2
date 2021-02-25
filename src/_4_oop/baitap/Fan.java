package _4_oop.baitap;

public class Fan {
    public static void main(String[] args) {
        FanClass myFan1=new FanClass();
        myFan1.setSpeed(3);
        myFan1.setColor("blue");
        myFan1.setRadius(10);
        myFan1.setIsOn(true);
        System.out.println(myFan1.display());
        FanClass myFan2=new FanClass();
        myFan2.setIsOn(false);
        myFan2.setSpeed(2);
        myFan2.setColor("yellow");
        myFan2.setRadius(5);
        System.out.println(myFan2.display());
    }
}

