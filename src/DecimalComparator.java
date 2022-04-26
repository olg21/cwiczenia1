

public class DecimalComparator {

    public static boolean areEqualByThreeDeimalPlaces(double a, double b){
        a = (int) (a*1000);
        b= (int) (b*1000);
        return a == b;
    }
}
