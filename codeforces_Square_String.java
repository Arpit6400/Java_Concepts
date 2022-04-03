package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class codeforces_Square_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int m = s.length()/2;
            if(s.substring(0,m).equals(s.substring(m,s.length())))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("No");
            }
            }
        }
    }