package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Task02 {
    public static void main(String[] args) throws IOException {
        //    2 Создать файл file.txt. Если файл уже создан,
        //    ничего делать не надо. Записать в файл слово
        //    TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
        Path path = Path.of("file.txt");
        Files.createFile(path);
        Files.writeString(path, "TEXT".repeat(100));
    }
}
