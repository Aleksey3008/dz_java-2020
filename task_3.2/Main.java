public class Main {
    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;


    }

    public static void main(String[] args) {
        Main cat = new Main();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
