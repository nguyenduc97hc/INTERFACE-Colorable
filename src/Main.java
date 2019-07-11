public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.resize(Math.floor(Math.random()*100));
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(6,4);
        rectangle.resize(Math.floor(Math.random()*100));
        System.out.println(rectangle);

        Square square = new Square(4);
        square.howToColor();
        System.out.println(square);
    }
}
