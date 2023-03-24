class creatures {

    //declare private members here
    public int age;
    public String name;
    void set_data(int a, String b) {
        //initialize members here
        this.age = a;
        this.name = b;
    }
    public creatures(){
        this.age =0;
        this.name = null;
    }
    //implement getters here
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getAnimalDetails(){
        return ("The " + getClass().getSimpleName() + " named " + name + " is " + age + " years old.");
    }
}

//define derived class named "Zebra" here
class Zebra extends creatures {
    final String origin = "Africa";
    String message_zebra() {
        //define here
        return (getAnimalDetails()+ " The "+ getClass().getSimpleName()+" comes from " + origin); //update this when you write your code

    }
}

//define derived class named "Dolphin" here

class Dolphin extends creatures {
    final String origin = "New Zealand";
    String message_dolphin() {
        //define here
       return (getAnimalDetails()+" The "+ getClass().getSimpleName()+" comes from " + origin); //update this when you write your code

    }
}
public class UseInheritance {
    public static void main(String [] args){
        Zebra Jin = new Zebra();
        Jin.set_data(4,"jin");
        System.out.println(Jin.message_zebra());

        Dolphin Ann = new Dolphin();
        Ann.set_data(2,"Ann");
        System.out.println(Ann.message_dolphin());
    }
}
