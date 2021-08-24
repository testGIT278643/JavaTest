package packageOne;

public class TestHanna {
    public static void main(String[] args) {
       hello("Hanna");
        hello("Dasha");

        double l=5;
        double a=4;
        double b =6;
        System.out.println("площадь со стороной "+l+" равна "+area(l));
        System.out.println("площадь прямогугльника: "+area(a,b));
    }

    public static void hello(String name){
        System.out.println("Hello "+name+"!");
    }

    public  static  double area (double len){
        return len*len;
    }

    public static double area (double a,double b){
        return a*b;
    }

}

