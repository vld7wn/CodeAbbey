/**
 * If you already learned how to write program with a simple loop from Sum in Loop task,
 * this new exercise will be just a simple modification.
 * Now we are given several pairs of values and we want to calculate sum for each pair.
 * Input data will contain the total count of pairs to process in the first line.
 * The following lines will contain pairs themselves - one pair at each line.
 * Answer should contain the results separated by spaces.
 * Example:
 * data:
 * 3
 * 100     8
 * 15      245
 * 1945    54
 * <p>
 * answer:
 * 108 260 1999
 **/

/**
 * Loop count: 12
 * First array     Second Array
 * 371054        108980
 * 560348        868976
 * 27207         154867
 * 822672        823616
 * 62609         528332
 * 992181        448633
 * 808152        242545
 * 719059        966488
 * 641379        573309
 * 669672        313814
 * 436403        736932
 * 107997        979232
 * answer: 
 * 480034 1429324 182074 1646288 590941 1440814
 * 1050697 1685547 1214688 983486 1173335 1087229
 **/
public class SumsInLoop {
    public static void main(String[] args) {
        int[] a = {371054, 560348, 27207, 822672, 62609, 992181, 808152, 719059, 641379, 669672, 436403, 107997};
        int[] b = {108980, 868976, 154867, 823616, 528332, 448633, 242545, 966488, 573309, 313814, 736932, 979232};

        for (int i = 0; i < 12; i ++) {
            int c = a[i] + b[i];
            System.out.println(c);
        }
    }
}
