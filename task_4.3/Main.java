public class Main {
    public static void main(String[] args){
        Horse zhuzik = new Horse("Zhuzik",5,"Rusak");

        Pegasus pegasus = new Pegasus("Spaik",10,"white");
        zhuzik.run();
        pegasus.fly();


    }

}
abstract class Animal{
    String nickname;
    int age;
    String breed;

    public Animal(String nickname, int age, String breed) {
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;
    }

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
    void run(){
        System.out.println("Игого я побежал(а)");
    }
    void fly (){
        System.out.println("Игого, я полетел(а)");
    }
}



class Horse extends Animal{
    public Horse(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    public void run(){
        System.out.println("Игого я побежал(а)");
    }
}
class Pegasus extends Animal{
    public Pegasus(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    public void fly (){
        System.out.println("Игого, я полетел(а)");
    }
}
