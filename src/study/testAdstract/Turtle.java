package study.testAdstract;

public class Turtle extends Animal implements Swimable{
    public Turtle(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Turtle -> " + toString());
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() + yDistance);
    }
}
