        package _01_introduction_java.bai_tap;
        import sun.awt.Symbol;

        import java.util.Scanner;
        public class Ung_dung_so_thanh_chu {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                short num = scanner.nextShort();
                String str="",string="",str1="",str2="",str3="";
                string=str.valueOf(num);
                switch (num){
                    case 0:
                        str = "Zero";
                        break;
                    case 1:
                        str = "One";
                        break;
                    case 2:
                        str = "Two";
                        break;
                    case 3:
                        str = "Three";
                        break;
                    case 4:
                        str = "Four";
                        break;
                    case 5:
                        str = "Five";
                        break;
                    case 6:
                        str = "Six";
                        break;
                    case 7:
                        str = "Seven";
                        break;
                    case 8:
                        str = "Eight";
                        break;
                    case 9:
                        str = "Nine";
                        break;
                    case 10:
                        str = "Ten";
                        break;
                    case 11:
                        str = "Eleven";
                        break;
                    case 12:
                        str = "twelve";
                        break;

                }
                if(num>12&&num<20){
                    switch (string.charAt(1)){
                        case '3':
                            str="thirteem";
                            break;
                        case '4':
                            str = "fourteen";
                            break;
                        case '5':
                            str = "fifteen";
                            break;
                        case '6':
                            str = "sixteen";
                            break;
                        case '7':
                            str = "seventeen";
                            break;
                        case '8':
                            str = "eighteen";
                            break;
                        case '9':
                            str = "nineteen";
                            break;
                    }
                }
                if(num>19&&num<100){
                    switch (string.charAt(0)){
                        case '2':
                            str1 = "twenty";
                            break;
                        case '3':
                            str1 = "thirty";
                            break;
                        case '4':
                            str1 = "forty";
                            break;
                        case '5':
                            str1 = "fifty";
                            break;
                        case '6':
                            str1 = "sixty";
                            break;
                        case '7':
                            str1 = "seventy";
                            break;
                        case '8':
                            str1 = "eighty";
                            break;
                        case '9':
                            str1 = "ninety";
                            break;
                    }
                    switch (string.charAt(1)) {
                        case '0':
                            str2 = "";
                        case '1':
                            str2 = " one";
                        case '2':
                            str2 = " two";
                            break;
                        case '3':
                            str2 = " three";
                            break;
                        case '4':
                            str2 = " four";
                            break;
                        case '5':
                            str2 = " five";
                            break;
                        case '6':
                            str2 = " six";
                            break;
                        case '7':
                            str2 = " seven";
                            break;
                        case '8':
                            str2 = " eigh";
                            break;
                        case '9':
                            str2 = " nine";
                            break;
                    }
                }
                if(num>99&&num<1000){
                    switch (string.charAt(0)){
                        case '1':
                            str1 = "one hundred";
                            break;
                        case '2':
                            str1 = "two hundred";
                            break;
                        case '3':
                            str1 = "three hundred";
                            break;
                        case '4':
                            str1 = "four hundred";
                            break;
                        case '5':
                            str1 = "five hundred";
                            break;
                        case '6':
                            str1 = "six hundred";
                            break;
                        case '7':
                            str1 = "seven hundred";
                            break;
                        case '8':
                            str1 = "eight hundred";
                            break;
                        case '9':
                            str1 = "nine hundred";
                            break;
                    }
                   switch (string.charAt(1)){
                      case '0':
                         str2="and";
                         break;
                        case 1:
                            switch (string.charAt(2)){
                          case '0':
                              str2 = " and ten";
                          case '3':
                              str2 = " and thirteen";
                              break;
                          case '4':
                              str2 = " and fourteen";
                              break;
                          case '5':
                              str2 = " and fifteen";
                              break;
                          case '6':
                              str2 = " and sixteen";
                              break;
                          case '7':
                              str2 = " and seventeen";
                              break;
                          case '8':
                              str2 = " and eighteen";
                              break;
                          case '9':
                              str2 = " and nineteen";
                              break;
                            }
                            break;
                        case '2':
                            str2 = " and twenty";
                            break;
                        case '3':
                            str2 = " and thirty";
                            break;
                        case '4':
                            str2 = " and forty";
                            break;
                        case '5':
                            str2 = " and fifty";
                            break;
                        case '6':
                            str2 = " and sixty";
                            break;
                        case '7':
                            str2 = " and seventy";
                            break;
                        case '8':
                            str2 = " and eighty";
                            break;
                        case '9':
                            str2 = " and ninety";
                            break;
                    }
                    if (str.charAt(1) != '1') {
                        switch (str.charAt(2)) {
                            case '0':
                                str3 = "";
                                break;
                            case '1':
                                str3 = " one";
                                break;
                            case '2':
                                str3 = " two";
                                break;
                            case '3':
                                str3 = " three";
                                break;
                            case '4':
                                str3 = " four";
                                break;
                            case '5':
                                str3 = " five";
                                break;
                            case '6':
                                str3 = " six";
                                break;
                            case '7':
                                str3 = " seven";
                                break;
                            case '8':
                                str3 = " eight";
                                break;
                            case '9':
                                str3 = " nine";
                                break;
                }
            }
        }
                str += str1 + str2 + str3;
                System.out.println(str);

            }
        }
