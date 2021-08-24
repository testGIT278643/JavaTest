package packageOne;

public class TestHanna {
    public static void main(String[] args) {
       hello("Hanna");
        hello("Dasha");

        Square s = new Square(5);

        double l=5;
        double a=4;
        double b =6;
        System.out.println("площадь со стороной "+s.l+" равна "+area(s));

        Rectangle r=new Rectangle(5,6);
       System.out.println("площадь прямогугльника: "+area(r));
    }

    public static void hello(String name){
        System.out.println("Hello "+name+"!");
    }

    public  static  double area (Square s){
        return s.l*s.l;
    }

    public static double area (Rectangle r){
        return r.a*r.b;
    }

}

