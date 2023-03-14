import java.util.Scanner;
public class XYZ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
       int n = sc.nextInt();
       int result = 0;
       int m =1;
            while(n!=0){
                int c = n%10;
                n=n/10;
               if(c!=0){
                   result = result + c*m;
                   m = m*10;
            }
        }
        System.out.println(result);


/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        int sum =0;
        int x =1;
        while(n!=0){
            int digit = n%10;
            n=n/10;
            if(digit!=0){
                sum = sum+x*digit;
                x=x*10;
            }
        }
        System.out.println(sum);


 */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(j%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        System.out.println(reversal(n));
        if(palindrome(n)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static int reversal(int n){
        int digit;
        int sum =0;
        while(n!=0){
            digit=n%10;
            sum=sum*10+digit;
            n=n/10;
        }
        return sum;
    }
    public static boolean palindrome(int n){
        if(reversal(n)==n){
            return true;
        }else{
            return false;
        }

         */

        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println("enter operator,1=addition;2=division : ");
        int o =sc.nextInt();
        switch (o) {
            case 1:
                System.out.println("first number : ");
                n1 = sc.nextDouble();
                System.out.println("second number: ");
                n2 = sc.nextDouble();
                System.out.println(isAddition(n1,n2));
            case 2:
                System.out.println("first number : ");
                n1 = sc.nextDouble();
                System.out.println("second number: ");
                n2 = sc.nextDouble();
                System.out.println(isDivision(n1,n2));
        }
    }
    public static double isAddition(double n1,double n2){
        return n1+n2;
    }
    public static double isDivision(double n1,double n2){
        return n1/n2;

    }
}


