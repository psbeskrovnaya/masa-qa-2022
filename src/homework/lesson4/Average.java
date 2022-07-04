package src.homework.lesson4;

public class Average {
    public static void main(String[] args) {
    int sum = 0;
    int count = 0;
    for (int i = 1; i <= 100; i++) {
        sum = sum + i;
        count++;
    }
        System.out.println(sum/count);
    }
}
