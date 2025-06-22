import java.util.Scanner;
// Пройти по массиву, вывести все элементы в прямом и в обратном порядке
public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
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
        System.out.print("Прямой порядок: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("\nОбратный порядок: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

