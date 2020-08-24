public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = 546/100;
        int b = ((546 - a*100)/10);
        int c = (546 - a*100) - b*10;
        number = a + b + c;
        return number;
    }
}
