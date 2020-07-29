package com.company;

import java.util.Scanner;

public class Main {

    public static void Nhap(int[] a, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
    }

    public static void Xuat(int[] a, int n) {
        System.out.println("Day so vua nhap la: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " | ");
        System.out.println();
    }

    public static void Xuat_tang(int[] a, int n) {
        System.out.println("Day so sap xep tang la: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " | ");
        System.out.println();
    }

    public static void Xuat_giam(int[] a, int n) {
        System.out.println("Day so sap xep giam la: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " | ");
        System.out.println();
    }

    public static int Max(int n, int[] a) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }

    public static int Min(int n, int[] a) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i])
                min = a[i];
        }
        return min;
    }

    public static void SX_tang(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int tmp;
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void SX_giam(int[] a, int n) {
        int tmp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    public static int Sum_arr(int[] a, int n) {
        int Tong_arr = 0;
        for (int i = 0; i < n; i++)
            Tong_arr = Tong_arr + a[i];
        return Tong_arr;
    }

    public static int is_SNT(int a) {
        if (a < 2) return 0;
        else
            for (int i = 2; i < a; i++) {
                if (a % i == 0) return 0;
            }
        return 1;
    }

    public static int Sum_Prime(int[] a, int n) {
        int tong = 0;
        for (int i = 2; i < n; i++) {
            if (is_SNT(a[i]) == 1) tong = tong + a[i];
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so n: ");
        n = scanner.nextInt();
        System.out.println("Nhap vap day so: ");
        int[] a = new int[n];
        Nhap(a, n);
        Xuat(a, n);

        System.out.println("Phan tu lon nhat la: " + Max(n, a));
        System.out.println();
        System.out.println("Phan tu nho nhat la: " + Min(n, a));
        System.out.println();

        SX_tang(a, n);
        Xuat_tang(a, n);
        System.out.println();
        SX_giam(a, n);
        Xuat_giam(a, n);
        System.out.println();

        System.out.println("Tong day la: " + Sum_arr(a, n));
        System.out.println();

        System.out.println("Tong cua cac SNT be hon n la: " + Sum_Prime(a, n));
    }
}
