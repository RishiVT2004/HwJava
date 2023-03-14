import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.Scanner;
public class Aprac {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int n1;
                int n2;
                System.out.println("enter opererator : ");
                int o = sc.nextInt();

                switch (o) {
                    case 1:
                        System.out.println("num1 is : ");
                        n1 = sc.nextInt();
                        System.out.println("num2 is : ");
                        n2 = sc.nextInt();
                        System.out.println(Addition(n1,n2));
                        break;
                    case 2:
                        System.out.println("num 1 : ");
                        n1 = sc.nextInt();
                        System.out.println("num2 is : ");
                        n2 = sc.nextInt();
                        System.out.println(Substraction(n1,n2));
                        break;
                    case 3:
                        System.out.println("n1 : ");
                        n1 = sc.nextInt();
                        System.out.println("n2 : ");
                        n2 = sc.nextInt();
                        System.out.println(Multiplication(n1,n2));
                        break;
                }
            }
            public static int Addition(int n1,int n2){
                return n1+n2;
            }
            public static int Substraction(int n1,int n2){
                return n1-n2;
            }
            public static int Multiplication(int n1,int n2){
                return n1*n2;
            }
        }






