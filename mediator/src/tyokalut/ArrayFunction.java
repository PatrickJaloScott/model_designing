package tyokalut;

import java.util.List;

public class ArrayFunction {
    private ArrayFunction() {}

    public static int getMin(List<Integer> integers) {
        int retInt = integers.get(0);
        for (Integer integer : integers) {
            if(integer < retInt) {
                retInt = integer;
            }
        }
        return retInt;
    }

    public static int getMax(List<Integer> integers) {
        int retInt = integers.get(0);
        for (Integer integer : integers) {
            if(integer > retInt) {
                retInt = integer;
            }
        }
        return retInt;
    }

    public static int getSum(List<Integer> integers) {
        int retInt = 0;
        for (Integer integer : integers) {
            retInt += integer;
        }
        return retInt;
    }
}
