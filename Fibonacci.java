package com.company;

import java.util.Scanner;

 class Fibonacci {
     private static long calc_fib(long n) {
         long [] result = new long[n+1];
         result[0] = 0;
         result[1] = 1;
         for(int i=2;i<n+1;i++) {
             result[i] = result[i-1] + result[i-2];
         }
         return result[n];
     }

     public static void main(String args[]) {
         Scanner in = new Scanner(System.in);
         long n = in.nextLong();

         System.out.println(calc_fib(n));
     }


}
