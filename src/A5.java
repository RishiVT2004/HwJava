import java.util.Scanner;
public class A5 {

    public static void main(String[] args) {
  /*
        Scanner sc = new Scanner(System.in);//AMICABLE NUMBERS
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        System.out.println("num2 : ");
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for(int i =1;i<num1/2;i++){
            if(num1%i==0){
                sum1 = sum1 +i;
            }
        }
        for(int j = 1;j<num2/2;j++){
            if(num2%j==0){
                sum2=sum2+j;
            }
        }
        if(sum1==num2&&sum2==num1){
            System.out.println("amicable");
        }else{
            System.out.println("not amicable");
        }

   */
        /*
        Scanner sc = new Scanner(System.in);//PRIME NUMBERS
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        int k =0;

        for(int i =2;i< Math.sqrt(num1);i++){
            if(num1%i==0) {
                k++;
                break;
            }
        }
        if(k==0){
            System.out.println("prime");
        }else{
            System.out.println("composite");
        }

         */
        /*
        //TWISTED PRIME

        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        int c = 0;
        int d = 0;
        int sum = 0;
        int digit;

        for (int i = 2; i < Math.sqrt(num1); i++) {
            if (num1 % i == 0) {
                c++;
                break;
            }
        }
        while (num1 != 0) {
            digit = num1 % 10;
            sum = sum * 10 + digit;
            num1 = num1 / 10;
        }
        for (int j = 2; j < Math.sqrt(sum); j++) {
            if (sum % j == 0)
            {
                d++;
                break;
            }
        }
        if(c==0&&d==0)
        {
            System.out.println( "twisted prime");
        }else{
            System.out.println("not twisted prime");
        }

         */

/*//prime no. between 2 no.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1  : ");
        int n1 = sc.nextInt();
        System.out.println("enter n2 : ");
        int n2 = sc.nextInt();
        for(int i =n1;i<=n2;i++){
            int count =0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }


 */

/*
        int low = 20, high = 50;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;

 */
        /*
        Scanner sc = new Scanner(System.in);//FACTORIAL BETWEEN 2 NUMBERS
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        System.out.println("num2 : ");
        int num2 = sc.nextInt();

        for(int i =num1;i<=num2;i++){
            int fact =1;
            for(int j =1;j<=i;j++){
                fact = fact*i;
            }
            System.out.println("factorial of "+i+" is "+fact);
        }

         */
        /*
       for(int j =2;j<=10;j++) {//MULTIPLICATION TABLE
           System.out.println("table of " + j);
           for (int i = 1; i <= 10; i++) {
               int ans = i*j;
               System.out.println(i + "X" + j + "=" + ans);
           }
       }

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j =1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        for(int i=1;i<=num1;i++){
            for(int j =i;j>=1;j--){
                System.out.print("$");
            }
            System.out.println();
        }

         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        for(int i=1;i<=num1;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

 */
/*

        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
       }
*/

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        for(int i=num1;i>=1;i--){
            for(int j =65;j<(65+i);j++){
                char c = (char)j;
                System.out.print(c+" ");
            }
            System.out.println();
        }

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        for(int i = num1;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print("&");
            }
            System.out.println();
        }

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j < num1 - i; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        int c=1;
        for(int i =num1;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }

 */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        int sum=0;
        for(int i = num1;i>=1;i--){
            for(int j =i;j>=1;j--){
                sum = sum+j;
            }
        }
        System.out.println(sum);

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        double sum =0;
        for(double i =0;i<=num1;i++){
            double ans = 1/i*i;
            sum = sum+ans;
        }

        System.out.print(sum+" ");
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        int a =0;int b =1;int c =2;
        System.out.print(a+" "+b+" "+c);
        for(int i =4;i<=num1;i++){
            int sum = a+b+c;
            System.out.print(sum+" ");
            a=b;
            b=c;
            c=sum;
        }


         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num1 : ");
        int num1 = sc.nextInt();
        for(int i =1;i<=num1;i++){
            for(int j = 1;j<=num1;j++){
                if(i==j){
                    System.out.print("$ ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

         */
/*
        Scanner sc = new Scanner(System.in);//FIBONACHI SERIES
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n == 1)
            System.out.println(a);
        else if (n == 2) {
            System.out.println(b);
        } else {
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= n; i++) {

                int sum = a + b;
                a = b;
                b = sum;
                System.out.print(sum + " ");
            }
        }\

 */
    }
}

