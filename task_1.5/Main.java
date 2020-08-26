public class Main {
    public static void main(String[] args){
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double fahrenheit = (celsium *(9/5.0)) + 32;
        return fahrenheit;

    }
}
