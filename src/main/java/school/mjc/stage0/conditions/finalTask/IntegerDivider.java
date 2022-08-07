package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {
        int division = dividend/divider;
        boolean dividedCompletely = divider * division == dividend;
        int dividedCompletelyToInt = dividedCompletely? 1:0;
        String result = switch(dividedCompletelyToInt) {
            case 1 -> {
                yield "can be divided completely";
            }
            default -> {
                yield "cannot be divided completely";
            }
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        printCompletelyDivided(6, 3);
        printCompletelyDivided(7, 4);
        printCompletelyDivided(4, 4);
        printCompletelyDivided(4, 8);
    }
}
