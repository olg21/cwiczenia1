import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(100000);

        System.out.println(BarkingClass.shouldWakeUp(true, 23));

        System.out.println(LeapYearCalculator.isLeapYear(1600));

        System.out.println(DecimalComparator.areEqualByThreeDeimalPlaces(-1.2234,-1.2232));

        System.out.println(" has teen: " + EqualSumChecker.hasTeen(9,99,19));
        System.out.println(EqualSumChecker.isTeen(9));

        System.out.println(CalculateFeetToCenti.calcFeetAndInchestoCentimeters(6, 1));
        System.out.println(CalculateFeetToCenti.calcFeetAndInchestoCentimeters(-10));

        System.out.println("area is : " + AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(5.0,4.0));


    }

    }

