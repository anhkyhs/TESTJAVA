package com.example.testjava;

public class Bai1 {
        public static void main(String[] args) {
            int[] arr = {3, 5, 7, 2, 8, 1, 4};
            int maxValue = findMax(arr);
            System.out.println("Giá trị lớn nhất trong mảng là: " + maxValue);
        }

        public static int findMax(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Mảng không được rỗng");
            }

            int max = arr[0]; // Giả sử phần tử đầu tiên là lớn nhất

            // Duyệt qua mảng để tìm phần tử lớn nhất
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i]; // Cập nhật giá trị max nếu tìm thấy phần tử lớn hơn
                }
            }

            return max;
        }
}
