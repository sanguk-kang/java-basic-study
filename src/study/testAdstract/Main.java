package study.testAdstract;

public class Main {
    public static void main(String[] args) {
        Pigeon p = new Pigeon(5, 10, 14);
        p.printInfo();
        p.age();
        p.move(100);
        p.printInfo();
        p.fly(5);
        p.printInfo();
        p.attack();
        System.out.println();

        Turtle t = new Turtle(100, -10, 95);
        t.printInfo();
        t.age();
        t.move(-100);
        t.printInfo();
        t.attack();
        t.swimDown(1000);
        t.printInfo();
        System.out.println();

        Kevin k = new Kevin(0, 0, 35);
        k.printInfo();
        k.age();
        k.move(10);
        k.printInfo();
        k.attack();
        k.cording();
        k.swimDown(20);
        k.printInfo();
        k.talk();



    }
}
