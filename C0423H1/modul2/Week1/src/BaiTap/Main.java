package BaiTap;
public class Main {
    public static void main(String[] args) {
   Circle i= new Circle(300);
   Circle j= new Circle(200);
        System.out.println("anh khanh bao in thu: "+ j.getId());
        System.out.println(i.getPerimeter());
        System.out.println(i.getArena());
        System.out.println(Circle.maxRadius);
        System.out.println(Circle.sumArena);
    }
}
