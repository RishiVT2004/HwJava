import java.security.Key;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
    /*
    // 1  2  3  4  5
    // 6  7  8  9
    // 10 11 12
    // 13 14
    // 15

        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        int count = 1;
        for(int i =n;i>=1;i-- ){
            System.out.println();
            for(int j =1;j<=i;j++){
                System.out.print(count+"  ");
                count++;
            }
        }
     */
        /*

      // simple calculator


        Scanner sc = new Scanner(System.in);
        System.out.println("n1: ");
        double n1 = sc.nextDouble();
        System.out.println("operator : ");
        char o = sc.next().charAt(0);
        System.out.println("n2 : ");
        double n2 = sc.nextDouble();

        switch (o){
            case'+':
                System.out.println(n1 + n2);
                break;
            case'-':
                System.out.println(n1-n2);
                break;
            case'*':
               System.out.println(n1*n2);
               break;
            case'/':
                System.out.println(n1/n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;
        }
        }
         */

        // REMOVING ALL ZEROES

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        int m =1;
        int result =0;
        while(n!=0){
            int digit = n%10;
            n = n/10;
            if(count!=0){
                result = result+m*digit;
                m = m*10;
            }
        }
        System.out.println(result);


        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("n1 : ");
        int n1 = sc.nextInt();
        System.out.println("n2: ");
        int n2 = sc.nextInt();

        if(n1%n2==0||n2%n1==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

         */

        // power table
        /*
        int A,B;
        System.out.println("A "+"B "+"Pow(A,B)");
        for(A =3,B=1;B<=4;A=A+2,B++){
            System.out.println(A+" "+B+" "+(Math.pow(A,B)));
        }
         */

        // END SEM 2019 Q3) C-:
/*
        for(int i =0;i<=7;i++){
            int m =  (int)Math.pow(2,i);
            System.out.print(m+" ");
        }

 */
        //  END SEM2019 Q3 A-:
        /*

       int m = (int)((Math.random())*11)+1;
        System.out.println(m);
        if(m>=1&&m<=3){
            System.out.println("quadrant 1 ");
        }else if(m>=4&&m<=6){
            System.out.println("quadrant 2 ");
        }else if(m>=7&&m<=9){
            System.out.println("quadrant 3");
        } else{
            System.out.println("quadrant 4");
        }
         */
        // END SEM2019 Q3 B-:
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("your salary is : ");
        double salary = sc.nextDouble();
        System.out.println("your years of service(more than 5/less) : ");
        int service = sc.nextInt();

        if(service>=5){
            double bonus = (5*salary)/100;
            double netsalary  = salary+bonus;
            System.out.println("net salary is "+netsalary);
        }else{
            System.out.println("net salary is "+salary);

        }
       */
        //applying charecter
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("your units consumed is : ");
        double units = sc.nextDouble();
        double price = units*43.5;
        System.out.println("do you want to pay online(y/n)");
        char ch = sc.next().charAt(0);
        if(ch=='y'){
            double discount = 3*price/100;
            double netcost = price - discount;
            System.out.println("net bill : "+netcost);
        }else{
            System.out.println("net bill "+price);
        }
         */

        // Write a java program to calculate the area of triangle, square, circle, rectangle by using method
        //overloading.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter your shape (1-4): ");
        int shape = sc.nextInt();

        switch (shape){
            case 1:
                System.out.println("length : ");
                int l = sc.nextInt();
                System.out.println("breath : ");
                int b = sc.nextInt();
                System.out.println(areaRectangle(l,b));
                break;
            case 2:
                System.out.println("side : ");
                int s = sc.nextInt();
                System.out.println(areaSquare(s));
                break;
            case 3:
                System.out.println("radius : ");
                int r = sc.nextInt();
                System.out.println(areaCircle(r));
                break;
            case 4:
                System.out.println("base : ");
                int ba = sc.nextInt();
                System.out.println("height : ");
                int h = sc.nextInt();
                System.out.println(areaTriangle(ba,h));
                break;
        }
    }
    public static int areaRectangle(int l,int b){
        int area = l*b;
        return area;
    }
    public static int areaSquare(int s){
        int area = s*s;
        return area;
    }
    public static int areaCircle(int r){
        int area = (int) (Math.PI*r*r);
        return area;
    }
    public static int areaTriangle(int ba,int h){
        int area = (int) (0.5*h*ba);
        return area;
        }
        */

        // CHECK IF STRING IS PALLINDROME OR NOT
        /*


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string  : ");
        String a = sc.next();
        if(pallindrome(a)){
            System.out.println(a+" is a palindrome");
        }else{
            System.out.println(a+" is not a palindrome");
        }
    }
    public static boolean pallindrome(String a){
        int n = a.length();
        for(int i = 0;i<=a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

         */
        // COUNTING VOWELS IN STRING
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string  : ");
        String a = sc.next();
        System.out.println(count(a));
    }
    public static int count(String a){
        int c =0;
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'|a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                c++;
            }
        }
        return c;

         */
        //Write a method that finds the number of occurrences of a specified character in a string using
        //the following header:

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string  : ");
        String A = sc.next();
        System.out.println("enter your character : ");
        char a = sc.next().charAt(0);
        System.out.println(count(A,a));
    }
    public static int count(String A,char a){
    int d=0;
        for(int i =1;i<=A.length()-1;i++){
            if(A.charAt(i)==a){
                d++;
            }
        }
        return d;



        //Write a Java method to display the middle character of a string.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string  : ");
        String A = sc.next();
        System.out.println(MiddleCharecter(A));
    }
    public static String MiddleCharecter(String A){
        int length = A.length();
        if(length%2==0){
          return A.substring(length/2,(length+1)/2);
        }else{
            return A.substring(length/2,(length+2)/2 );
        }
         */

        //Write a Java method to count all words in a string

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string  : ");
        String A = sc.nextLine();
        System.out.println(words(A));
    }
    public static int words(String A){
        int count =0;
        for(int i =0;i<=A.length()-1;i++){
            if((A.charAt(i)==' ')&&(A.charAt(i+1)!=' ')){
            count++;
            }
        }
        return count+1;



        //Some websites impose certain rules for passwords.
        //Write a method that checks whether a string is a valid password. Suppose the password rules
        //are as follows:
        // A password must have at least eight characters.
        // A password consists of only letters and digits.
        // A password must contain at least two digits.
        //Write a program that prompts the user to enter a password and displays Valid Password if the
        //rules are followed or Invalid Password otherwise

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your password  : ");
        String A = sc.nextLine();
        if (validPassword(A)) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }
    }
    public static boolean validPassword(String A) {

        if (A.length() < 8) {
            return false;
        }
        int count = 0;
            for (int i = 1; i < A.length(); i++) {
                char c = A.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                }
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            if (count >= 2) {
                return true;
            }
            return false;

         */
        //PRIME NUMBERS BETWEEN 2 NUMBERS;
        /*
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
        // TWISTED PRIME
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num  : ");
        int num = sc.nextInt();
        int sum =0;
        int digit;
        int count1 =0;
        int count2 =0;

        for(int i=2;i<num;i++){
            if(num%i==0){
                count1++;
            }
        }
        while(num!=0){
            digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        for(int j =2;j<sum;j++){
            if(sum%j==0){
                count2++;
            }
        }
        if(count2==0&&count1==0){
            System.out.println("twisted prime");
        }else{
            System.out.println("not twisted prime");
            }
 */
/*
        //COSX--> i=0;
        //SINX-->i=1;
        double t =n;
        double sum =0;
        int i =0;

        do{
            sum=sum+t;
            i=i+2;
            t=-t*n*n/(i*(i-1));
        }while (Math.abs(t)>0.00001);
        System.out.println(sum);
   */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num  : ");
        int n = sc.nextInt();

        for(int i =1;i<Math.sqrt(n);i++){
            int count1=0;
            for(int j =1;j<=i;j++){
                if(i%j==0){
                    count1++;
                }
                if(count1==2){
                    int k = n-i;
                    int count2=0;
                    for(int m =1;m<=k;m++){
                        if(k%m==0){
                            count2++;
                        }
                        if(count2==0){
                            System.out.println(n+" can be written as - "+i+" "+"+"+" "+k);
                        }
                    }
                }
            }
        }
//LINEAR SEARCH

        Scanner sc = new Scanner(System.in);
        int []a= new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter item to be searched ");
        int x = sc.nextInt();
        int index = Lsearch(a,x);

        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("not present");
        }
    }
    public static int Lsearch(int[]a,int x){
        for(int i =0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
}

         */
    }
}
