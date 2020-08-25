public class Main {
    public static void main(String[] args){
        Cat zhuzik = new Cat("Zhuzik",5,"Mein Cun");

        Mouse jerryMouse = new Mouse("Jerry", 12,5);

        Dog spaik = new Dog("Spaik",10,"white");

    }

}

class Cat{
    String nickname;
    int age;
    String breed;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String nickname, int age, String breed) {
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;

    }
    void speak (){
        System.out.println(this.nickname+"Maay");
    }
}
class Mouse{
    String name;
    int height;
    int tail;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;

    }
    void speak (){
        System.out.println(this.name + "Pipi");

    }
}
class Dog{
    String name1;
    int age;
    String colour;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Dog(String name1, int ages, String colour){



    }
    void speak (){
        System.out.println(this.name1 +"GavGav");

    }
}
