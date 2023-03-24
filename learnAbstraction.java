abstract class Animal {

    public abstract void makeSound();

    public abstract int legCount();

    public abstract boolean hasFur();

    public void move(){
        System.out.println(classPrintout() + " is moving.");
    }
    public void details(){
        System.out.println(classPrintout() + " has "+ legCount()+" legs");
    }
    private String classPrintout(){

        return getClass().getSimpleName();
    }
}

class Cat extends Animal{

    @Override
    public void makeSound(){

        System.out.println("Meow!");
    }

    @Override
    public int legCount(){

        return 4;
    }

    @Override
    public boolean hasFur(){

        return true;
    }
}

class Dog extends Animal {

    @Override
    public void makeSound(){

        System.out.println(getClass().getSimpleName()+ " Bark!");
    }

    @Override
    public int legCount(){

        return 4;
    }
    @Override
    public boolean hasFur(){

        return false;
    }
}

class learnAbstraction {
    public static void main(String[] args) {
        Animal pussycat = new Cat();
        Animal Scrubby = new Dog();
            pussycat.makeSound();
            pussycat.hasFur();
            pussycat.details();
            pussycat.move();

            Scrubby.details();
            Scrubby.hasFur();
            Scrubby.makeSound();
            Scrubby.move();
    }
}
