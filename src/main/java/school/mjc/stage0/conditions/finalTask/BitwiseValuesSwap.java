package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void swap(int first, int second) {
        System.out.println(first);
        System.out.println(second);
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {
        swap(5, 7);
        swap(-5, 12);
    }
}
