public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(555));
    }

    public static int sumDigitsInNumber(int number) {
        int num1 = number / 100;
        int num2 = (number - (num1 * 100)) / 10;
        int num3 = number - ((num1 * 100) + (num2 * 10));

        return num1 + num2 + num3;
    }
}
