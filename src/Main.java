import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        int[] pay = {150, 385, 684, 255, 345};
        int sum = 0;
        for (int i : pay) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //task2
        System.out.println("Task 2");
        int[] pay2 = {25, 355, 685, 22, 485};
        int min = 100000;
        int max = 0;
        for (int i : pay2) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max);
        //Task3
        System.out.println("Task3");
        int[] pay3 = {142, 543, 11, 234, 654};
        float avg;
        sum = 0;
        for (int i : pay3) {
            sum += i;
        }
        avg = (float) sum / pay3.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
        //task4
        System.out.println("Task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i <= reverseFullName.length - 1; i++) {
            if (i > reverseFullName.length / 2) {
                break;
            }
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        //System.out.println(Arrays.toString(reverseFullName));
        for (char i :reverseFullName){
            System.out.print(i);
        }
        System.out.println();
    }
}
