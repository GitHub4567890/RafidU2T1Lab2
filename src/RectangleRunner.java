public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(20,10);
        System.out.println("This rectangle has an area of " + rect1.calculateArea() + " and a volume of " + rect1.calculateBoxVolume());
    }
}
