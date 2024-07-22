package Objorient;

interface Mamma{
    void bark();
    void bite(String biting);
    void jump();

    boolean canSwim(String Swimming);
    boolean isRunning();
}

class Elephant implements Mamma{
    private String canBePet;
    private boolean isRunning;

    public Elephant(String canBePet){
        this.canBePet=canBePet;
    }


    @Override
    public void bark() {
        System.out.println("Elephants can't Bark ");
    }

    @Override
    public void bite(String biting) {
        System.out.println(" Biting ");
    }

    @Override
    public void jump() {
        if(isRunning){
            System.out.println("Can Bite you, so Run....");
            isRunning=false;
        }else {
            System.out.println("Don't run , friendly Mammal");
        }
    }

    @Override
    public boolean canSwim(String Swimming) {
        if(Swimming==canBePet){
            isRunning=true;
            System.out.println("Good boy");
        }else {
            System.out.println("Bad boy");
            isRunning=false;
        }
        return isRunning;
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}

class Cat implements Mamma {

    public String canBePet;
    public boolean isRunning;
    public boolean isGoofy;

    public Cat(String canBePet) {
        this.canBePet = canBePet;
    }
    @Override
    public void bark() {
        System.out.println("Cats can't Bark ");
    }

    @Override
    public void bite(String biting) {
        System.out.println(" Biting ");
    }

    @Override
    public void jump() {
        if(isRunning && isGoofy){
            System.out.println("Can Bite you, so Run....");
            isRunning=false;
        }else {
            System.out.println("Don't run , friendly Mammal");
        }
    }

    @Override
    public boolean canSwim(String Swimming) {
        if(Swimming==canBePet && isGoofy){
            isRunning=true;
            System.out.println("Good boy");
        }else {
            System.out.println("Bad boy");
            isRunning=false;
        }
        return isRunning;
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}

public class Mammals {
    public static void main(String[] args) {
        Cat cattu = new Cat("Tommy");
        cattu.isRunning();
        cattu.canSwim("Bold");
        cattu.bark();
        

    }
}
