package study.testAdstract;

public class Kevin extends Human implements Programmer, Swimable{
    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Kevin -> " + toString());
    }

    @Override
    public void cording() {
        System.out.println("Hello World!");

    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() + yDistance);
        if (getY() < -10) {
            System.out.println("너무 깊게 들어가면 뒤짐!!");
        }
    }

}
