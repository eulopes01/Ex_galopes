public class retan {

    public double x;
    public double y;


    static double areadouble(double x, double y){return x * y;
    }

    static double perimetroDouble (double x, double y){ return 2 * (x + y);
    }

    static double diagonalDouble(double x, double y){
        return Math.hypot(x, y);
    }

}
