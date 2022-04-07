package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        private static boolean isPrime(int n) {
            int temp;
            if (n == 1) return false;
            for (int i = 2; i <= n / 2; i++) {
                temp = n % i;
                if (temp == 0) return false;
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner str = new Scanner(System.in);
            boolean f = false;
            System.out.print("Enter n = ");
            int n = str.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = (int)(Math.random()*100);
                System.out.println(a[i]);
            }
            System.out.print("Enter trd = ");
            boolean trd = str.nextBoolean();
            if (!trd) {
                for (int i = 0; i < n; i++) {
                    if (isPrime(a[i])) {
                        System.out.println("true");
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    System.out.println("false");
                }
            } else {
                System.out.println(Arrays.stream(a).anyMatch(x -> isPrime(x)));
            }
            str.close();
        }


    }
