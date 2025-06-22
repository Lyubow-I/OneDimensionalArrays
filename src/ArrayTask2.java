import java.util.Scanner;

//Найти минимальный-максимальный элементы и вывести в консоль
public class ArrayTask2 {
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
                array[i] = (int) (Math.random() * 10);
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

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}

