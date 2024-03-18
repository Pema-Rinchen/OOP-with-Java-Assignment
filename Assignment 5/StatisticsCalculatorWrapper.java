import java.lang.Math;

public class StatisticsCalculatorWrapper {
    public static Double Min(Double[] numbers) {
        Double min = numbers[0];
        for (Double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static Double Max(Double[] numbers) {
        Double max = numbers[0];
        for(Double num : numbers) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    public static Double Avg(Double[] numbers) {
        double sum = 0;
        for (Double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static Double SD(Double[] numbers) {
        double mean = Avg(numbers);
        double sumOfSquares = 0;
        for (Double num : numbers) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        double variance = sumOfSquares / numbers.length;
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        Double[] numbers = {4.5, 5.6, 7.8, 8.9};
        Double minimum = Min(numbers);
        System.out.println("Minimum of the numbers is: " + minimum);
        Double maximum = Max(numbers);
        System.out.println("Maximum of the numbers is: " + maximum);
        Double average = Avg(numbers);
        System.out.println("Average of the numbers is: " + average);
        Double standardDeviation = SD(numbers);
        System.out.println("Standard Deviation of the numbers is: " + standardDeviation);
    }
}
