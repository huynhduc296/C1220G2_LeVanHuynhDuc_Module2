package _02_vong_lap_java.baitap;

public class So_nguyen_to_100 {
    public static void main(String[] args) {
        int i=2;
        for (;i<=100;i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
            }
            if(count==2){
                System.out.print(i+" ");
            }

        }

    }
}
