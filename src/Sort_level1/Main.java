package Sort_level1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array [] = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution1 solution1 = new solution1();
        System.out.println(Arrays.toString(solution1.solution(array, commands)));
    }
}