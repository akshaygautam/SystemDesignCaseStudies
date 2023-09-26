package designPatterns.creationalPatterns.singleton;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(Test::testAll);
        Thread t2 = new Thread(Test::testAll);
        Thread t3 = new Thread(Test::testAll);
        t1.start();
        t2.start();
        t3.start();
    }

    private static void testAll() {
        earlyLoadChocolateBoiler();
        runChocolateBoilerLazy();
        synchronizedChocolateBoiler();
        doubleCheckSafeBoiler();
    }

    private static void runChocolateBoilerLazy(){
        ChocolateBoilerLazy boiler = ChocolateBoilerLazy.getInstance();
        System.out.println("Lazy Boiler " + boiler.hashCode());
    }

    private static void synchronizedChocolateBoiler() {
        ChocolateBoilerSynchronized boiler = ChocolateBoilerSynchronized.getInstance();
        System.out.println("Synchronized Boiler " + boiler.hashCode());
    }

    private static void doubleCheckSafeBoiler() {
        ChocolateBoilerThreadSafe boiler = ChocolateBoilerThreadSafe.getInstance();
        System.out.println("Double check Boiler " + boiler.hashCode());
    }

    private static void earlyLoadChocolateBoiler() {
        ChocolateBoilerPreLoad boiler = ChocolateBoilerPreLoad.getInstance();
        System.out.println("Preload Boiler " + boiler.hashCode());
    }
}
