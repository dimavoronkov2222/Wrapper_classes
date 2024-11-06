import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {
        String str1 = "Литерал";
        String str2 = new String("new");
        char[] chars = {'м', 'а', 'с', 'с', 'и', 'в'};
        String str3 = new String(chars);
        byte[] bytes = {104, 105, 106};
        String str4 = new String(bytes);
        StringBuilder str5 = new StringBuilder("StringBuilder");
        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitArray = fruits.split(",");
        String longestFruit = "";
        for (String fruit : fruitArray) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit;
            }
        }
        System.out.println(longestFruit.toLowerCase());
        System.out.println(longestFruit.substring(0, 3));
        String strWithSpaces = "   Я_новая_строка      ";
        String trimmedStr = strWithSpaces.trim();
        String replacedStr = trimmedStr.replace('_', ' ');
        System.out.println(replacedStr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();
        System.out.println("Вы ввели: " + input);
        if (input.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (input.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (input.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append("\n");
        sb.append(str2).append("\n");
        sb.append(str3).append("\n");
        sb.append(str4).append("\n");
        sb.append(str5).append("\n");
        String result = sb.toString();
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
    }
}