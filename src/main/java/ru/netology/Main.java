package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int size = 0;
        int max = 0;
        List<Integer> randomList = new ArrayList<>();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        max = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        Random random = new Random();
        System.out.print("Вот случайный список: ");
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(max));
            System.out.print(randomList.get(i) + " ");
        }
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filter = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        List<Integer> listFilter = new ArrayList<>();
        for (int s : randomList) {
            if (s > filter) {
                logger.log("Элемент " + s + " подходит");
                listFilter.add(s);
            } else {
                logger.log("Элемент " + s + " не подходит");
            }
        }

        logger.log("Прошло фильтр " + listFilter.size() + " из " + randomList.size());
        logger.log("Выводим результат на экран");

        System.out.print("Отфильтрованный список: ");
        for (int s : listFilter) {
            System.out.print(s + " ");
        }
        System.out.println();

        logger.log("Завершаем программу");

    }
}
