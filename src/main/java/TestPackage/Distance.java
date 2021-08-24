package TestPackage;

public class Distance {
    public static void main(String[] args) {

        Point p = new Point(2,3,4,5);
        System.out.println("distance is "+distance1(p));
    }



    public  static  double distance1 (Point p){
       double D;
       D=Math.sqrt(Math.pow((p.px2-p.px1),2)+Math.pow((p.py2-p.py1),2));
        return D;
    }


}
