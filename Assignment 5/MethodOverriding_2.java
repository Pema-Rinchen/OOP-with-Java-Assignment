class Beverage {
    protected void prepare() {
        System.out.println("Preparing");
    }

    protected void serve() {
        System.out.println("Serving");
    }
}

class Coffee extends Beverage {
    public void prepare() {
        System.out.println("Preparing Coffee");
    }

    public void serve() {
        System.out.println("Serving Coffee");
    }
}

class Tea extends Beverage {
    public void prepare() {
        System.out.println("Preparing Tea");
    }

    public void serve() {
        System.out.println("Serving Tea");
    }
}

class Smoothie extends Beverage {
    public void prepare() {
        System.out.println("Preparing Smoothie");
    }

    public void serve() {
        System.out.println("Serving Smoothie");
    }
}

public class MethodOverriding_2 {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        Tea t1 = new Tea();
        Smoothie s1 = new Smoothie();

        c1.prepare();
        c1.serve();

        t1.prepare();
        t1.serve();

        s1.prepare();
        s1.serve();
    }
}
