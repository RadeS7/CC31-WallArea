public class Main {

    public static void main(String[] args) {
	Wall wall = new Wall(5,4);

    System.out.println("Area is " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Height is " + wall.getHeight());
        System.out.println("Width is " + wall.getWidth());
        System.out.println("Area is now " + wall.getArea());

    }
}
