public static void main(String[] args) {
        Family gosha = new Family();
        gosha.name = "Гоша";
        Family mom=new Family();
        mom.name="Тамара";
        Family daddy = new Family();
        daddy.name = "Николай";
        Family grandmother = new Family();
        grandmother.name = "Вера " + "и "+ " Надежда";
        Family granddad = new Family();
        granddad.name = "Сергей " + "и " + " Василий";
        //Family granddad2 = new Family();
        //granddad2.name = "Василий";
        gosha.getInfo();
        mom.getInfoMom();
        daddy.getInfoDaddy();
        grandmother.getInfoBa();
        granddad.getInfiDad();


    }
}
class Family{
    String name;
    String lastname;
    int age;
    void sayHi(){
        System.out.println("Привет");
    }
    void getInfo(){
        System.out.println("Меня звать" +" "+ name);
    }
    void getInfoMom(){
        System.out.println("Имя моей мамы" + " "+ name);
    }
    void getInfoDaddy(){
        System.out.println("Имя моего папы" + " " + name);
    }
    void getInfoBa(){
        System.out.println("У меня две бабушки, " + "бабушка "  + name );
    }
    void getInfiDad(){
        System.out.println("У меня два деда, " + "деда " + name);
    }
}
