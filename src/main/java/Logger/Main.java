package Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Logger loger = Logger.getInstance();
        loger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        loger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int listSize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();

        loger.log("Создаём и наполняем список");

        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            source.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + source.toString());

        loger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int filter = scanner.nextInt();
        loger.log("Запускаем фильтрацию");
        Filter filter1 = new Filter(filter);
        filter1.filterOut(source);
        loger.log("Завершаем программу");

    }
}
