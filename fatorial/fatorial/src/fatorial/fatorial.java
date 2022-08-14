package fatorial;

import java.util.*;
import java.math.BigInteger;


public class fatorial {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(n + "! = "+factorial(n));
      }

      public static BigInteger factorial(int n) 
      {
            BigInteger f = new BigInteger("1");
            for (int i = n; i > 0; i--)
                  f = f.multiply(BigInteger.valueOf(i));
            return f;
      }
}