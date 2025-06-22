import java.util.Scanner;

//Проверить, является ли массив возрастающей последовательностью (каждое следующее
//число больше предыдущего)
public class ArrayTask6 {
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
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                System.out.println("Массив НЕ является возрастающей последовательностью");
                return;
            }
        }
        System.out.println("Массив является возрастающей последовательностью");
    }
}
