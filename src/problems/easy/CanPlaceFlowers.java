package src.problems.easy;

import java.util.Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        // https://leetcode.com/problems/can-place-flowers/
        System.out.println("Can Place Flowers");
        int[] input = { 1, 0, 0, 0, 1 };

        System.out.println(canPlaceFlowers(input, 2) == false);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int lengthOfArray = flowerbed.length;

        int emptySpaces = 0;

        for (int i = 0; i < lengthOfArray; i++) {
            int space = flowerbed[i];

            if (space != 0)
                continue;

            if (lengthOfArray == 1) {
                emptySpaces++;
                break;
            }

            if (i == 0 && flowerbed[i + 1] == 0) {
                emptySpaces++;
                flowerbed[i] = 1;
                continue;
            }

            if (i == 0 && flowerbed[i + 1] != 0) {
                continue;
            }


            if (i == lengthOfArray - 1 && flowerbed[i - 1] == 0) {
                emptySpaces++;
                flowerbed[i] = 1;
                continue;
            }

            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                emptySpaces++;
                flowerbed[i] = 1;
                continue;
            }
        }

        if (emptySpaces >= n) {
            return true;
        }

        return false;
    }
}
