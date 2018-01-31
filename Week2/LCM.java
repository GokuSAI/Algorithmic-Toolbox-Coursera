package com.company;

import java.util.Scanner;

public class LCM {

    private static Long gcd(long a, long b) {
        // int current_gcd = 1;
        // for(int d = 2; d <= a && d <= b; ++d) {
        // }

        // return current_gcd;
        if (b == 0)
            return Long.valueOf(a);
        return gcd(b, a%b);
    }
    private static Long Lm(long a , long b){

        return Long.valueOf(((a*b)/gcd(a,b)));
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        System.out.println(Lm(a,b));
    }

}
