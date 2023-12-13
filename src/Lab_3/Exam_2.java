package Lab_3;

import java.util.Scanner;

public class Exam_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите название дня недели");
        String day = in.nextLine();

        switch(day){
            case "Понедельник","понедельник" :
                System.out.println("Порядковый номер в неделе - 1");
                break;
            case "Вторник","вторник":
                System.out.println("Порядковый номер в неделе - 2");
                break;
            case "Среда","среда":
                System.out.println("Порядковый номер в неделе - 3");
                break;
            case "Четверг","четверг":
                System.out.println("Порядковый номер в неделе - 4");
                break;
            case "Пятница","пятница":
                System.out.println("Порядковый номер в неделе - 5");
                break;
            case "Суббота","суббота":
                System.out.println("Порядковый номер в неделе - 6");
                break;
            case "Воскресенье","воскресенье":
                System.out.println("Порядковый номер в неделе - 7");
                break;
            default:
                System.out.println("Такого дня не существует");
                break;
        }
    }
}
