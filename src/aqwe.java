import java.sql.SQLOutput;
import java.util.Scanner;
public class aqwe {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("n : ");
        int n = sc.nextInt();

         */
        /*
        for (int i = n; i >= 1; i--) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
                for (int k = 65; k <= 64+i; k++) {
                    char a =(char)k;
                    System.out.print(a+" ");
                }
            System.out.println();
            }
*/
        /*
        for(int i =n;i>=1;i--){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k =65;k<=64+(2*i-1);k++){
                char c = (char)k;
                System.out.print(c);
            }
            System.out.println();
        }

         */
        /*
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =i-1;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        */
        /*
        int []a = {5,3,2,4,6};
        for(int i =0;i<a.length-1;i++){
            System.out.println(a[i]>a[i-1]);
        }
        for(int i = a.length-1;i>=0;i--){
            System.out.println(a[i--]);
        }
         */
        //1
        //3 5
        //8 11 14
        //18 22 26 30
        //35 40 45 50 55
        /*
        int c =1;
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++) {
                System.out.print(c + " ");
                if(i==j){
                    break;
                }else{
                    c = c+i;
                }
            }
            c=c+i+1;
            System.out.println();
        }

         */


        /*
        1
        121
        12321
        1234321

        String s = " ";
        for(int i =1;i<=n;i++){
            s=s+i+s;
            System.out.println(s+" ");
            */
            String a ="rishi";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.charAt(1));
        System.out.println(a.equals("rish"));
        System.out.println(a.indexOf('i'));
        System.out.println(a.indexOf('s'));
        System.out.println(a.indexOf('r'));
        System.out.println(a.substring(0));
        System.out.println(a.substring(2));
        System.out.println(a.substring(0,3));
        System.out.println(a.length());

        }
    }


