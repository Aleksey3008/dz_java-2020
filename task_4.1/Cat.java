public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int cat1 = 0;
            int cat2 = 0;
            if (this.age > anotherCat.age){
                cat1 = cat1 + 10;
                cat2 = cat2 + 9;}
            else if (this.age == anotherCat.age){
                cat1 = cat1 + 9;
                cat2 = cat2 + 9;
            }
            else {
                cat1 = cat1 + 9;
                cat2 = cat2 + 10;
            }
            if (this.weight > anotherCat.weight){
                cat1 = cat1 + 10;
                cat2 = cat2 + 9;}
            else if (this.weight == anotherCat.weight){
                cat1 = cat1 + 9;
                cat2 = cat2 + 9;
            }else {
                cat1 = cat1 + 9;
                cat2 = cat2 + 10;
            }
            if (this.strength > anotherCat.strength){
                cat1 = cat1 + 10;
                cat2 = cat2 + 9;}
            if (this.strength == anotherCat.strength){
                cat1 = cat1 + 9;
                cat2 = cat2 + 9;}
            else {
                cat1 = cat1 + 9;
                cat2 = cat2 + 10;
            }
            if (cat1 > cat2){
                return  true;
            }
            else if (cat1 == cat2){
                return false;
            }
            else return false;


        }
    }

    public static void main(String[] args) {

    }
}
