package com.example.testjava;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Chuỗi là đối xứng.");
        } else {
            System.out.println("Chuỗi không phải là đối xứng.");
        }

        scanner.close();
    }

    // Hàm kiểm tra chuỗi đối xứng
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Nếu có ký tự không khớp, chuỗi không đối xứng
            }
            left++;
            right--;
        }

        return true; // Nếu không có sự khác biệt, chuỗi là đối xứng
    }
}
