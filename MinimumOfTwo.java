import java.util.Arrays;

/**
 * Most programs should be able to make some choices and decisions.
 * And we are going to practice conditional programming now.
 * This is usually done by a kind of if ...
 * else statements which may look like:
 * <p>
 * IF some_condition THEN
 * do_something
 * ELSE
 * do_other_thing
 * ENDIF
 * Depending on your programming language syntax could be different and
 * else part is almost always optional.
 * You can read more in wikipedia article on Conditional statements.
 * <p>
 * Of two numbers, please, select one with minimum value.
 * Here are several pairs of numbers for thorough testing.
 * <p>
 * Input data will contain number of test-cases in the first line.
 * Following lines will contain a pair of numbers to compare each.
 * For Answer please enter the same amount of minimums separated by space,
 * for example:
 * data:
 * 3
 * 5 3
 * 2 8
 * 100 15
 * <p>
 * answer:
 * 3 2 15
 * <p>
 * -2142539 7170418
 * 9950667 -3804749
 * 7248274 7392228
 * -8128717 -4110003
 * -9730315 6690653
 * 3174487 2237201
 * 9577207 -9542815
 * -9708701 210796
 * 4375297 -5291106
 * -5338412 7092152
 * -2249262 -9452341
 * -5862854 2437730
 * 8989677 1050014
 * 3948191 786917
 * 2982429 5669984
 * -9904960 -7607877
 * -8781948 4733328
 * -2018950 5276257
 * 6555636 8139811
 * -5040868 -7509046
 * 5246879 -2571375
 * -7982882 -1146865
 *
 * answer: [-2142539, -3804749, 7248274, -8128717, -9730315, 2237201, -9542815, -9708701, -5291106, -5338412, -9452341, -5862854, 1050014, 786917, 2982429, -9904960, -8781948, -2018950, 6555636, -7509046, -2571375, -7982882]
 **/

public class MinimumOfTwo {
    public static void main(String[] args) {
        int[] a = {-2142539,
                9950667,
                7248274,
                -8128717,
                -9730315,
                3174487,
                9577207,
                -9708701,
                4375297,
                -5338412,
                -2249262,
                -5862854,
                8989677,
                3948191,
                2982429,
                -9904960,
                -8781948,
                -2018950,
                6555636,
                -5040868,
                5246879,
                -7982882};
        int[] b = {7170418,
                -3804749,
                7392228,
                -4110003,
                6690653,
                2237201,
                -9542815,
                210796,
                -5291106,
                7092152,
                -9452341,
                2437730,
                1050014,
                786917,
                5669984,
                -7607877,
                4733328,
                5276257,
                8139811,
                -7509046,
                -2571375,
                -1146865,};
        int[] c = new int[22];
        for (int i = 0; i < 22; i++) {
            c[i] = Math.min(a[i], b[i]);
        }
        System.out.print(Arrays.toString(c));
    }
}
