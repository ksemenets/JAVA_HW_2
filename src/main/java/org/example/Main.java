package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
        //задача 1
        public static void main(String[] args) throws IOException {
            Path path = Path.of("file.txt");
            //Files.createFile(path);
            String string = "";
            int count = 100;
            while (count > 0) {
                string += "TEXT";
                count--;
            }
            Files.writeString(path, string);
            System.out.println(BuildString(6, 'x', 'y'));

        }
        //задача 2
        private static String BuildString ( int n, char c1, char c2){
            String str1 = new String(new char[]{c1, c2});
            String str2 = "";
                while (n > 0) {
                    str2 += str1;
                    n--;
                }
                return str2;
        }
}

