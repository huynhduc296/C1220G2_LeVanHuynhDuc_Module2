package validcheck;

import exception.EmailException;
import exception.NameException;
import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInformation {
        public static final String id_Regex="^SV(VL|HO|RO)-[\\d]{4}";
        public static final String name_Regx="^[A-Z][a-z]*";
        private static Pattern pattern;
        private static Matcher matcher;
        public static boolean isValidService(String string,String reget){
            pattern=Pattern.compile(reget);
            matcher=pattern.matcher(string);
            boolean Flag=matcher.matches();
            if(!Flag){
                System.out.println("Input not matching"+reget);
            }
            return Flag;
    }
    public  boolean isMoreThan(double number,double startNumber,double endNumber){
            boolean flag =number>startNumber&&number<endNumber;
            if(!flag){
                System.out.println("in put not in"+startNumber+","+endNumber);
            }
            return flag;
    }
    public boolean isValidExtraServiceName(String extraServiceName){
        String[]list={"massge","karaoke","food","drink","car"};
        boolean flag = Arrays.asList(list).contains(extraServiceName);
        if(!flag){
            System.out.println("extra service name is not in last vervice");
        }
        return  flag;
    }
    public void isValidFullName(String fullName) throws NameException {
        String[]fullNameElement=fullName.split(" ");
        for (String element:fullNameElement){
            if(Character.isLowerCase( element.charAt(0))){
                throw new NameException();
            }
        }
        for (int i=0;i<fullName.length()-1;i++){
            if(fullName.charAt(i)==' '&&fullName.charAt(i+1)==' '){
                throw new NameException();
            }
        }
    }
    public void isValidEmail(String email) throws EmailException {
        int posA=email.indexOf("@");
        if(posA<0){
            throw new EmailException();
        }
        int countA=0;
        int posPoint=0;

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                countA++;
            }else if(email.charAt(i)=='.'){
                posPoint++;
            }
            if(countA>=2){
                throw new EmailException();
            }
        }
        if(posPoint==0||posPoint>3){
            throw new EmailException();
        }
    }
}
