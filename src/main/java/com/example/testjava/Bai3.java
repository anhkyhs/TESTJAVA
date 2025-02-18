package com.example.testjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bai3 {
    public static void main(String[] args) {
        // Đường dẫn file cần đọc
        String fileName = "abc.txt";

        // Gọi phương thức đếm từ
        try {
            Map<String, Integer> wordCount = countWordsInFile(fileName);

            // In ra kết quả đếm từ
            System.out.println("Số lần xuất hiện của các từ trong file:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    // Hàm đếm số lần xuất hiện của từng từ trong file
    public static Map<String, Integer> countWordsInFile(String fileName) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+"); // Tách từ theo khoảng trắng

            for (String word : words) {
                word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Chuyển thành chữ thường và loại bỏ ký tự đặc biệt
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        reader.close();
        return wordCount;
    }
}
