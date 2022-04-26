public class EqualSumChecker {

    public static boolean hasEqualSum( int one, int two, int three){

        return (one + two) == three;
    }

    public static boolean hasTeen(int x, int y, int z){
        return isTeen(x) || isTeen(y) || isTeen(z);
    }


    public static boolean isTeen(int first){

        return first >=13 && first <= 19;
    }
}
