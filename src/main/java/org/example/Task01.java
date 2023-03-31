package org.example;

public class Task01 {
    public static void main(String[] args) {
//        1 Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2,
//        начиная с c1.
//        Пример. (n = 6, c1='a', c2='b') -> "ababab"
//        (n = 8, c1='x', c2='y') -> "xyxyxyxy"

        System.out.println(buildString(6, 'a', 'b'));
        System.out.println(buildString(8, 'x', 'y'));
    }
    static String buildString(int n, char c1, char c2) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newString.append(c1).append(c2);
        }
        return String.valueOf(newString);
    }
}
