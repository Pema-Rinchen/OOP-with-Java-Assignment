class DistanceCalculator
{
    double x1, y1, x2, y2;
    double meter1, meter2;

    void distance(double x1, double y1, double x2, double y2)
    {
        double dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distance = "+dist+" units");
    }
    void distance(int meter1, int meter2)
    {
        int dist = meter2-meter1;
        System.out.println("distance in meters = "+dist+" units");

    }

    void distance(int kilometer1, int kilometer2, int km)
    {
        int dist = (kilometer2-kilometer1);
        System.out.println("distance in kilometers = "+dist+" units");

    }
}

public class Overloading1 {
    public static void main(String[] args) {
        DistanceCalculator d = new DistanceCalculator();
        d.distance(1, 5);
        d.distance(2, 3, 0);
        d.distance(1,0, 4, 5);

    }
}
