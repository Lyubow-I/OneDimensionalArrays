import java.util.Scanner;
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//сообщение, что их нет
public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: 7");
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
        int zeroCount = 0;
        for (int num : array) {
            if (num == 0) {
                zeroCount ++;
            }
        }
        if (zeroCount> 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else{
            System.out.println("Нулевых элементов нет");
        }
    }
}
