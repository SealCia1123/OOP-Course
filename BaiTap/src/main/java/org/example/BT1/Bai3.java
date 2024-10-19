package org.example.BT1;

import java.io.*;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        while (opt != 0) {
            System.out.println("1. Nhập địa chỉ email, in ra địa chỉ user");
            System.out.println("2. Nhập vào chuỗi và in số lượng ký tự in hoa");
            System.out.println("3. Đọc tập tin input.txt và thay thế {file} bằng chuỗi tập tin và ghi kết quả vào output.txt");
            System.out.println("4. Đếm số từ trong xâu (từ cách nhau bằng khoảng trắng, dấu phẩy hoặc dấu châm phẩy) và tìm từ dài nhất");
            System.out.println("5. Chuẩn hóa chuỗi: xóa khoảng trắng hai đầu, giữa hai từ có nhiều khoảng trắng thì thay thế bằng 1 khoảng trắng, ký tự đầu mỗi từ viết hoa và ký tự khác viết thường");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 0:
                    System.out.println("Kết thúc chương trình");
                    break;
                case 1: {
                    System.out.print("Nhập vào địa chỉ email: ");
                    String userEmail = sc.nextLine();
                    String userAddress = userEmail.substring(0, userEmail.indexOf("@"));
                    System.out.println("Địa chỉ user của bạn là: " + userAddress);
                    break;
                }
                case 2: {
                    System.out.print("Nhập vào chuỗi: ");
                    String userString = sc.nextLine();
                    int count = 0;
                    Character c = Character.valueOf('c');
                    for (int i = 0; i < userString.length(); i++) {
                        if (Character.isUpperCase(userString.charAt(i)))
                            count++;

                    }
                    System.out.println("Số ký tự in hoa trong chuỗi là: " + count);
                    break;
                }
                case 3: {
                    File read = new File("src/main/resources/input.txt");
                    try (Scanner scanner = new Scanner(read)) {
                        String content = scanner.nextLine();
                        content = content.replaceAll("\\{[a-zA-z]+\\}", "tập tin");
                        System.out.println(content);
                        File write = new File("src/main/resources/output.txt");
                        try (FileWriter w = new FileWriter(write, true)) {
                            PrintWriter writer = new PrintWriter(w);
                            writer.println(content);
                            System.out.println("Ghi file thành công");
                        } catch (IOException e) {
                            System.out.println("Lỗi mở file");
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Không tìm thấy file");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhập vào chuỗi: ");
                    String userString = sc.nextLine();
                    String[] words = userString.split("[,\\s;]+");
                    String longestWord = words[0];
                    for (String i : words) {
                        if (i.length() > longestWord.length()) {
                            longestWord = i;
                        }
                    }
                    System.out.println("Số từ trong xâu vừa nhập là: " + words.length);
                    System.out.println("Từ dài nhất trong xâu là: " + longestWord);
                    break;
                }
                case 5: {
                    System.out.print("Nhập vào chuỗi: ");
                    String userString = sc.nextLine();
                    String[] words = userString.trim().
                            replaceAll("\\s+", " ").split(" ");
                    String result = "";

                    for (String i : words) {
                        String firstChar = i.substring(0, 1).toUpperCase();
                        String remainChars = i.substring(1).toLowerCase();
                        result += firstChar + remainChars + " ";
                    }

                    result = result.trim();
                    System.out.println("Xâu đã chuẩn hóa: " + result);
                    break;
                }
                default:
                    System.out.println("Lua chon khong hop le");
            }
            System.out.println("=========================================");
            System.out.println();
        }
    }
}
