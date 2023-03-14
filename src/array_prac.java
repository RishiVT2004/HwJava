import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class array_prac {
    public static void main(String[] args) {
        /*
        /SUM OF ARRAYS

       double[] a = {21.4,84.5,78.1,45.2,86.4};
       double sum =0;
       for(int i =0;i<a.length;i++){
           sum = sum + a[i];
       }
        System.out.println(sum);

         */
// whether an int is present in an array
 /*
        int[] value = {21,84,78,45,86};
        int num = 21;
        for(int i =0;i<value.length;i++)
            if (a[i]==num) {
               return;
                break;
            }
        if(value){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }


  */

        // AVERAGE MARKS

        /*
        double[] a = {21.4,84.5,78.1,45.2,86.4};
        double sum =0;
        for(int i =0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println("average marks "+ sum/a.length);

         */

        // REVERSAL OF ARRAY

/*
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }


 */


        //MAXIMUM ELEMENT IN ARRAY
        /*
        int[] a = {21,8,78,45,86};
        int max =a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max)
         */

        //2nd Max element
        /*

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(SecondMax(a));
    }

    public static int SecondMax(int[] a) {
        int maximum = a[0];
        int secondmax = Integer.MIN_VALUE;
        for (int i = 0; i <a.length; i++)
            if (a[i]>maximum) {
             secondmax = maximum;
             maximum = a[i];
            }else if(a[i]>=secondmax&&a[i]!=maximum) {
                a[i]= secondmax;
            }
        return secondmax;

         */
    }
}

        //MINIMUM ELEMENT IN ARRAY
        /*
        int[] a = {21,8,78,45,86};
        int min =a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
         */


        //SECOND MINIMUM ELEMENT;
        /*
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("elements");
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
            System.out.println(SecondSmallest(a));
    }
    public static int SecondSmallest(int []a){
        int smallest = a[0];
        int secondsmallest = Integer.MAX_VALUE;
        for(int i =0;i<a.length;i++){
            if(a[i]<smallest){
                secondsmallest=smallest;
                smallest=a[i];
            } else if (a[i]<=secondsmallest && a[i]!=smallest) {
                secondsmallest = a[i];
            }
        }
        return secondsmallest;


    }
}
    */

        //ARRAY IS INC/DEC;

/*
        int[] a = {1,2,3,4,5};
        boolean arrangment = true;
        for(int i =0;i<a.length-1;i++) {
            if (a[i] > a[i + 1]) {
                arrangment = false;
                break;
            }
        }
           if(arrangment){
               System.out.println("sorted");
           }else{
               System.out.println("not sorted");
           }


 */
        // random element in array and its average

    /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        int sum =0;

        for(int i =0;i<=a.length-1;i++){
            a[i]=(Math.Random()*(n-1))+1;
            sum = sum+a[i];
        }
        sout(sum);
        double average = (double)sum/n;
        System.out.println("average "+average);
        }
     }

*/
/*
    //REVERSING FIRST HALF OF ARRAY

        Scanner sc = new Scanner(System.in);
        int []a = new int[8];
        System.out.println(" elements ");
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int j=a.length/2-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
        for(int i = a.length/2 ;i<a.length; i++){
            System.out.print(a[i]+" ");

        }
        // LINEAR SEARCH

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
