package com.company;

import javax.swing.*;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //#1
//        int num = 5646;
//
//        int thousand = num / 1000;
//        num = num % 1000;
//        int hundred = num / 100;
//        num = num % 100;
//        int ten = num / 10;
//        num = num % 10;
//        int one = num;
//
//        if (thousand + hundred == ten + one) {
//            System.out.println(true);
//        } else System.out.println(false);
/////////////////////////////////


        //#2
//        double b = 10;
//        double a = 4;
//        double c = 2;
//        double d = b+ (Math.sqrt((b*b+4*a*c)/2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
//        System.out.println(d);
/////////////////////////////////


        //#3
//        int a = 5, b = 6;
//        System.out.println("Периметр:" + 2 * (a + b));
//        System.out.println("Площадь:" + a * b);
/////////////////////////////////


        //#4
//        int x = -3;
//        int y = -5;
//        if (y >= -3 && y <= 4 && x>=-4 && x<=4){
//        System.out.println(true);
///       }else System.out.println(false);
/////////////////////////////////


        //#5
//    int x = 5; {
//    if (x >= 0) {
//        Math.pow(x, 2);
//    }else
//    { Math.pow(x, 4);
//    }
/////////////////////////////////


        //#6
//        int a = 422;
//        int b = 45;
//        int c = 399;
//        int min;
//        int max;
//        min = Math.min(a,b);
//        min = Math.min(min,c);
//        max = Math.max(a,b);
//        max = Math.max(max,c);
//        System.out.println(max+min);
/////////////////////////////////


        //#7
//        double x = 4;
//        x =Math.sin(x)*Math.sin(x)-Math.cos(2*x);
/////////////////////////////////


        //#8
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int multiplicity = 3;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % multiplicity == 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);
/////////////////////////////////


        //#9
//        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] array2 = {2, 4, 6, 8, 0};
//        int[] unitedArray = new int[array1.length + array2.length];
//        int k = 4;
//
//        int counter = 0;
//        for (int i = 0; i < k; i++) {
//            unitedArray[counter++] = array1[i];
//        }
//        for (int i = 0; i < array2.length; i++) {
//            unitedArray[counter++] = array2[i];
//        }
//        for (int i = k; i < array1.length; i++) {
//            unitedArray[counter++] = array1[i];
//        }
//
//        for (int a : unitedArray) {
//            System.out.print(a);
//        }


/////////////////////////////////

        //#10
//        int n, k, num;
//        Scanner s = new Scanner(System.in);
//        PrintWriter out = new PrintWriter(System.out);
//
//        n = s.nextInt();
//        k = 1;
//        num = n;
//
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < arr.length; j++) {
//                    arr[i][j] = k;
//                    k++;
//                }
//                k = 1;
//            } else {
//                for (int j = 0; j < arr.length; j++) {
//                    arr[i][j] = num;
//                    num--;
//                    ;
//                }
//                num = n;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        out.close();
/////////////////////////////////

    }
}







