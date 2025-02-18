package com.example.testjava;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện thoại
        System.out.print("Nhập số điện thoại (chỉ chứa chữ số): ");
        String phoneNumber = scanner.nextLine();

        // Kiểm tra và định dạng số điện thoại
        if (isValidPhoneNumber(phoneNumber)) {
            String formattedPhoneNumber = formatPhoneNumber(phoneNumber);
            System.out.println("Số điện thoại đã được định dạng: " + formattedPhoneNumber);
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }

        scanner.close();
    }

    // Hàm kiểm tra số điện thoại hợp lệ (chỉ chứa chữ số và dài 10 ký tự)
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}"); // Kiểm tra chuỗi có đúng 10 chữ số hay không
    }

    // Hàm chuyển đổi số điện thoại thành định dạng "(XXX) XXX-XXXX"
    public static String formatPhoneNumber(String phoneNumber) {
        // Sử dụng StringBuilder để tạo định dạng
        StringBuilder formatted = new StringBuilder();

        formatted.append("(");
        formatted.append(phoneNumber, 0, 3); // Lấy 3 chữ số đầu tiên
        formatted.append(") ");
        formatted.append(phoneNumber, 3, 6); // Lấy 3 chữ số tiếp theo
        formatted.append("-");
        formatted.append(phoneNumber, 6, 10); // Lấy 4 chữ số cuối cùng

        return formatted.toString();
    }
}
