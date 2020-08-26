 public static void main(String[] args) {
            Person valera=new Person("Валера","Иванов",69,null,null);
            Person olga = new Person("Ольга","Иванова",67,null,null);
            Person oleg = new Person("Олег","Петров",65,null,null);
            Person jula = new Person("Юля","Петрова",67,null,null);
            Person alex = new Person("Алексей","Иванов",37,olga,valera);
            Person eva  = new Person("Ева","Иванова",37,jula,oleg);
            Person gosha= new Person("Гоша","Иванов",10,eva,alex);
            System.out.println("Меня зовут: "+gosha.getName());
            System.out.println("Имя моей мамы:" + eva.getName());
            System.out.println("Имя моего папы:" +alex.getName());
            System.out.println("У меня две бабушки, бабушка  "+gosha.getMother().getMother().getName() + " и " +olga.name);
            System.out.println("У меня два деда, деда "+oleg.getName() + " и " +valera.getName());

        }
    }

    class Person{
         String name;
         String lastname;
         int age;
         int hp = 100;
         Person mother;
         Person father;
        public Person(String name, String lastname, int age, Person mother, Person father){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }
        public String getName() {
            return this.name;
        }
        public int getHp(){
            return this.hp;
        }
        public Person getMother(){
            return this.mother;
        }
        public void setHp(int hp){
            if (this.hp+hp>100) this.hp = 100;
            else this.hp = this.hp + hp;
        }
    }

