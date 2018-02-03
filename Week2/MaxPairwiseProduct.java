package com.company;
import java.util.Scanner;
public class MaxPairwiseProduct {

    public static void main(String[] args) {


                Scanner in = new Scanner(System.in);

                int x=in.nextInt();

                int[] a=new int[x];
                for(int i=0;i<x;i++){
                    a[i]=in.nextInt();
                }
                System.out.println(Long.valueOf(PairWise(a)));

            }
            static long PairWise(int [] a){
                long result = Long.valueOf(0) ;
                int n = a.length;
                int m1=Integer.MIN_VALUE;
                int m2=Integer.MIN_VALUE;
                for(int i=0;i<n;i++){
                    if(a[i]>m1){
                        m2=m1;
                        m1=a[i];
                    }
                    else if (a[i]>m2){
                        m2=a[i];

                    }
                    if(Long.valueOf(m1)*m2>result){
                        result=Long.valueOf(m1)*m2;
                    }
//                    for (int j=i+1;j<n;j++){
//
//                        if(Long.valueOf(a[i])*a[j]>result){
//                            result=Long.valueOf(a[i])*a[j];
//                        }
//                    }
                }
                return result;
            }
        }

