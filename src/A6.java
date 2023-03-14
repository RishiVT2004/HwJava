import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        //Q1

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
}

         */

      /*
        //Q3
        Scanner sc = new Scanner(System.in);
        System.out.println("number is : " );
        int n = sc.nextInt();
        System.out.println(reversal(n));
        if(isPalindrone(n)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
    public static int reversal(int n){
        int r =0;
        while(n!=0){
            int digit = n%10;
            r=r*10+digit;
            n=n/10;

        }
        return r;
    }
    public static boolean isPalindrone(int n){
        if(reversal(n)==n){
            return true;
        }else{
          return false;
        }

       */
        /*

        //Q4
        Scanner sc = new Scanner(System.in);
        System.out.println("number of years is : " );
        int y = sc.nextInt();
        System.out.println(isNumberOfDays(y));
    }
    public static int isNumberOfDays(int y){
        int days=y*365;
        return days;

         */

         /*
Q1
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operation needed to be performed(1-6) : " );
        int o = sc.nextInt();
        int n1 ,n2;
        switch (o){
            case 1:
                System.out.print("enter first number : ");
                n1=sc.nextInt();
                System.out.print("enter second number : ");
                n2=sc.nextInt();
                System.out.println(simpleAddition(n1,n2));
                break;
            case 2:
                System.out.print("enter first number : ");
                n1=sc.nextInt();
                System.out.print("enter second number : ");
                n2=sc.nextInt();
                System.out.println(simpleSubstraction(n1,n2));
                break;
            case 3:
                System.out.print("enter first number : ");
                n1=sc.nextInt();
                System.out.print("enter second number : ");
                n2=sc.nextInt();
                System.out.println(simpleMultiplication(n1,n2));
                break;
            case 4:
                System.out.print("enter first number : ");
                n1=sc.nextInt();
                System.out.print("enter second number : ");
                n2=sc.nextInt();
                System.out.println(simpleDivision(n1,n2));
                break;
            case 5:
                System.out.print("enter first number : ");
                n1=sc.nextInt();
                System.out.print("enter second number : ");
                n2=sc.nextInt();
                System.out.println(simpleModularDivision(n1,n2));
                break;
            case 6:
                System.out.print("enter first number : ");
                n1=sc.nextInt();
                System.out.println(simpleSquareRoot(n1));
                break;
        }
    }
    public static int simpleAddition(int n1,int n2) {
        return n1+n2;
    }
    public static int simpleSubstraction(int n1,int n2){
        return n1-n2;
    }
    public static int simpleMultiplication(int n1,int n2){
        return n1*n2;
    }
    public static int simpleDivision(int n1,int n2){
        return n1/n2;
    }
    public static int simpleModularDivision(int n1,int n2){
        return n1%n2;
    }
    public static double simpleSquareRoot(int n1){
        return Math.sqrt(n1);

          */

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("given string is : ");
        String str = sc.nextLine();
        System.out.println("charecter is :");
        char a = sc.next().charAt(0);
        System.out.println(count(str, a));
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) // range of string --> 0 to n-1
        {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}


 */

        /*
        //Q7

        Scanner sc = new Scanner(System.in);
        System.out.println("given string is : ");
        String str = sc.nextLine();
        System.out.println(vowel(str));
    }

    public static int vowel(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

         */
        /*
        //Q8

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String A = sc.nextLine();

        if (Palindrome(A)) {
            System.out.println(A + " is palindrome");
        } else {
            System.out.println(A + " is not a palindrome");
        }
    }

        public static boolean Palindrome(String A){
            int n = A.length();
            for(int i=0;i<n/2-1;i++){
                if(A.charAt(i)!=A.charAt(n-i-1)){
                    return false;
                }
            }
            return true;

         */

        //Q9
        /*

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the password : ");
            String Password = sc.nextLine();

            if (ValidPassword(Password)) {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        }
        public static boolean ValidPassword(String Password){
            if(Password.length()<8){
                return false;
            }
            int count =0;
            for(int i=0;i<Password.length();i++){
                char c = Password.charAt(i);
                if(!Character.isLetterOrDigit(c)){
                    return false;
                }
                if(Character.isDigit(c)){
                    count++;
                }
            }
             if(count>=2){
                 return true;
             }
             return false;


    }
}

         */
}
}