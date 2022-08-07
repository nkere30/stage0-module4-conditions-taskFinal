package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public static void printQuadrant(int x, int y) {
        String quadrant;
        if(x > 0 && y > 0) {
            quadrant = "first";
        } else if(x < 0 && y > 0) {
            quadrant = "second";
        } else if(x < 0 && y < 0) {
            quadrant = "third";
        } else if (x > 0 && y < 0){
            quadrant = "fourth";
        } else {
            quadrant = "zero";
        }
        System.out.println(quadrant);
    }

    public static void main(String[] args) {
        printQuadrant(0, 0);
        printQuadrant(1, 0);
        printQuadrant(0, 1);
        printQuadrant(1, 1);
        printQuadrant(-1, -1);
        printQuadrant(-1, 0);
        printQuadrant(0, -1);
        printQuadrant(1, -1);
        printQuadrant(-1, 1);
    }
}
