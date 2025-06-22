import java.util.Scanner;
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д
public class ArrayTask5 {
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
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
        System.out.println("Массив после перестановки:");
        for (int num : array) {
            System.out.println(num + " ");
        }
    }
}
