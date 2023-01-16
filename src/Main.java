import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    private static int sizeM;
    private static int max;

    private static int treshold;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Пhограмма запущена");
        Scanner scanner = new Scanner(System.in);
        logger.log("Ввод пользователем исходных данных");
        System.out.println("Введите размер списка");
        sizeM = scanner.nextInt();
        logger.log("Ввод пользователем максимального числа");
        System.out.println(" Введите максимальное число в списке");
        max = scanner.nextInt();
        logger.log("Создаем новый список размером "+ sizeM);
        List<Integer> list = new ArrayList<>(sizeM);
        Random random = new Random();
        logger.log("Заполняем список случайными числами");
        for (int i = 0; i < sizeM; i++) {
            list.add(random.nextInt(max));
        }
        logger.log("Выводим список в консоль");
        System.out.println("Случайный список:");
        System.out.println(list);
        logger.log("Ввод пользователем число для фильтрации");
        System.out.println("Введите число для фильтрации списка");
        treshold = scanner.nextInt();
        logger.log("Фильтрация списка");
        Filter filter = new Filter(treshold);
        logger.log("Вывод отфильтрованного списка");
        System.out.println(" Отфильтрованный список: " + filter.filterOut(list));
    }
}
