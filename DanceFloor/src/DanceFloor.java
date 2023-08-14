interface Dancable {
    void dance();
}

class Dancer implements Dancable {
    @Override
    public void dance() {
        System.out.println("Dancer is dancing!");
    }
}

class PopDancer implements Dancable {
    @Override
    public void dance() {
        System.out.println("PopDancer is dancing!");
    }
}

public class DanceFloor {
    public static void main(String[] args) {
        Dancable firstDancer = new Dancer();
        Dancable secondDancer = new PopDancer();

        Dancable[] dancers = new Dancable[6];
        dancers[0] = new Dancer();
        dancers[1] = new PopDancer();
        dancers[2] = new Dancer();
        dancers[3] = new PopDancer();
        dancers[4] = new Dancer();
        dancers[5] = new PopDancer();

        for (Dancable dancer : dancers) {
            dancer.dance();
        }
    }
}
