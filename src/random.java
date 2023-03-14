import com.sun.source.tree.BreakTree;

import java.util.Scanner;
public class random {
    public static void main(String[] args) {
/*
        int count = 1;
        for(int i =1 ;i<=5;i++){
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
 */

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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        int[] a = new int [n];
        int sum =0;
        for(int i =0;i<=a.length-1;i++){
            a[i]=(int)(Math.random()+n);
            sum = sum + a[i];
        }
        System.out.println(sum);
        double average = (double)sum/n;

        System.out.println("average "+average);
         */
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        int sum =0;

        for(int i =0;i<=a.length-1;i++){
            a[i]=(int) (Math.random()*(n-1))+1;
            sum = sum+a[i];
        }
        System.out.println(sum);
        double average = (double)sum/n;
           System.out.println("average "+average);

         */

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
    }


    }
