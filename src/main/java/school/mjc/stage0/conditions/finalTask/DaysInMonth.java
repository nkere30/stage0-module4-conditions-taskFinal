package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void printDays(int year, int month) {
        boolean validDate = year >= 0 && (month > 0 && month < 13);
        boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        int leapYear = isLeap? 1:0;
        if(validDate) {
            int daysInMonth = switch(month) {
                case 2 -> {
                    int feb = switch(leapYear) {
                        case 1 -> {
                            yield 29;
                        }
                        default -> {
                            yield 28;
                        }
                    };
                    yield feb;
                }
                case 4, 6, 9, 11 -> {
                    yield 30;
                }
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    yield 31;
                }
                default -> {
                    yield -1;
                }
            };
            System.out.println(daysInMonth);
        } else {
            System.out.println("invalid date");
        }

    }

    public static void main(String[] args) {
        printDays(2000, 1);
        printDays(2000, 2);
        printDays(2021, 2);
        printDays(2000, 3);
        printDays(2000, 4);
        printDays(2000, 5);
        printDays(2000, 6);
        printDays(2000, 7);
        printDays(2000, 8);
        printDays(2000, 9);
        printDays(2000, 10);
        printDays(2000, 11);
        printDays(2000, 12);
        printDays(2000, 13);
        printDays(-1000, 13);
    }
}
