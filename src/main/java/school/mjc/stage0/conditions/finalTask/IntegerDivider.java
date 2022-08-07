package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {
        String result = "";
        if(divider != 0) {
            int division = dividend/divider;
            boolean dividedCompletely = divider * division == dividend;
            int dividedCompletelyToInt = dividedCompletely? 1:0;
            switch(dividedCompletelyToInt) {
                case 1:
                    result += "can be divided completely";
                    break;
                case 0:
                    result += "cannot be divided completely";
                    break;
                default:
                    break;
            }
        } else {
            result += "division by zero";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        printCompletelyDivided(6, 3);
        printCompletelyDivided(7, 4);
        printCompletelyDivided(4, 4);
        printCompletelyDivided(5, 0);
    }
}
