public class Main {
    public static int min(int a, int b, int c) {
        int m=0;
        if (a <= b && a <= c)
            m = a;
        else if (b <= c && b <= a)
            m = b;
        else if (c <= b && c <= a)
            m = c;
        return m;

    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
