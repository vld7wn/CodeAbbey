public class SumInLoop {
    /*Сложение чисел массива 29077*/
    public static void main(String[] args) {
        int[] a = {386, 140, 822, 1263, 333, 220, 1036, 1166, 89, 880,
                882, 46, 1276, 797, 1218, 1175, 143, 873, 1201, 748, 730, 1123, 426,
                591, 1295, 785, 802, 942, 315, 1008, 952, 259, 308,
                1266, 381, 1282, 1033, 248, 637};
        int b = 0;
        for (int i = 0; i < 39; i++) {
            b += a[i];
        }
        System.out.println(b);
    }
}
