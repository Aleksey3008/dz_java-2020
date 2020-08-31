public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        if (a > 0){
            System.out.println(a * 0.15+a);
        }
        else if (a == -1){
            System.out.println(a + 1);
        }
        else if (a == 0){
            System.out.println(0);
        }

    }

}
