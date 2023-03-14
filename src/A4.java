import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
     /*
        Scanner sc = new Scanner(System.in);
        System.out.println("num : ");
        int num = sc.nextInt();
        int sum =0;
        while (num != 0) {
            int m = num%10;
            sum = sum+m;
            num=num/10;
            }
        if(sum%9==0){
            System.out.println("divisible by 9");
        }else{
            System.out.println("not divisible  by 9");
        }

     */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int N = sc.nextInt();
        int sum =0;
        int count =0;
        do{
            int random = (int)(Math.random()*N)+1;
            System.out.println(random+" ");
            sum = sum + random;
            count++;
        }while(count<N);
        double avg = sum/N;
        System.out.println("the average is "+avg);


        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("n1: ");
        int n1 = sc.nextInt();
        System.out.println("n2: ");
        int n2 = sc.nextInt();

      int p;
      int q;
      int r=0;
        if(n1>n2){
            p=n1;
            q=n2;
        }else{
            q=n1;
            p=n2;
        }
        while (p%q!=0){
            r=p%q;
            p=q;
            q=r;
        }

        System.out.println("gcd of "+n1+" and "+n2+" is "+r);
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int N = sc.nextInt();
        int sum = 0;
        int digit;

        for (int i = 1; i < N / 2; i++) {
            if (N % i == 0) {
                sum = +i;
            }
        }
        if (sum == N) {
            System.out.println("perfect number");
        } else {
            System.out.println("invalid");

        }

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        double n = sc.nextDouble();
        System.out.println("m: ");
        double m = sc.nextDouble();
        double r = Math.pow(n,m);
        System.out.println(r);


         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        double n = sc.nextDouble();
        int i=0;
        while(i<=10){
            double m = n*i;
            i++;
            System.out.println(n+" X "+i+" = "+m);
        }


         */
        /*
        Scanner sc = new Scanner(System.in);
        int cg;
        int ug;
        System.out.println("your guess : ");
        ug = sc.nextInt();
         cg = ((int)(Math.random()*9)+1);
        System.out.println(cg);
        if(ug>cg){
            System.out.println("high");
        }else if(ug<cg){
            System.out.println("low");
        }else{
            System.out.println("CORRECT");
        }

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        String n = sc.next();
        String x =" ";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)!=0){
                x = x + n.substring(i,i+1);
                System.out.println(n);
            }
        }
        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        System.out.println("m : ");
        int m = sc.nextInt();
        int pow =1;
        while(m*pow<=n){
            pow = pow*m;
        }if(n<m){
            pow = 0;
        }
        System.out.println(pow);


         */
    }
}