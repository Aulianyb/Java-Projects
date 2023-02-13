public class App {
    public static void main(String[] args) throws Exception {
        Point point_1 = new Point(1, 2);
        Rectangle Rect1 = new Rectangle(1, 2, point_1);
        System.out.println("Jawaban = " + point_1.x);
    }
}
