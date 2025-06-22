import java.util.Scanner;
//Найти индексы минимального и максимального элементов и вывести в консоль
public class ArrayTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Выберите способ заполнения:");
        System.out.println("1 - Случайные числа");
        System.out.println("2 - Ручной ввод");
        int choice = scanner.nextInt();

        if (choice == 1) {
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        } else if (choice == 2) {
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + i + ": ");
                array[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Некорректный выбор. Завершение программы.");
            return;
        }
        System.out.print("Введённые числа: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int minIndex = 0;
        int maxIndex = 0;
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального элемента: " + minIndex);
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}
