import java.util.Arrays;

class PowTable {
    public static final int[] POWERS_2;

    static {
        POWERS_2 = new int[] {1*1,2*2,3*3,4*4,5*5,6*6,7*7,8*8,9*9,10*10};

    }
}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}