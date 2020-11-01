public class Tester{
  public static void main(String[] args){
    Point x = new Point(0, 0);
    Point y = new Point(3, 4);
    System.out.println(x.getX());
    System.out.println(x.getY());
    System.out.println(x.distanceTo(y));
  }
}
