package com.company;

public class palindrome_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //for first half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //for second half numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
