package Lab_4;

import java.util.Scanner;

public class Exam_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();

        String encryptStr = Caeser.encrypt(text, key);
        System.out.println("Текст после преобразования: "+ encryptStr);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean cool = false;
        while (!cool){
            String reply = in.nextLine();
            if (reply.toLowerCase().equals("y")){
                String decryptText = Caeser.decrypt(encryptStr, key);
                System.out.println(decryptText);
                cool = true;
            }
            else if (reply.toLowerCase().equals("n")){
                System.out.println("До свидания!");
                cool = true;
            }
            else {
                System.out.println("Введите корректный ответ");
                cool = false;
            }


        }

    }
}
