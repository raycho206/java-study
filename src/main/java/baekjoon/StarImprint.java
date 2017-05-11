package baekjoon;

/**
 * 별찍기
 */
public class StarImprint {
    private static final String STAR    = "☆";
    private static final String BLANK   = "ㅁ";

    private int line;

    public StarImprint(int line) {
        this.line = line;
    }

    // 00100
    // 01110
    // 11111
    public void print() {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= ((line * 2) - 1); j++) {
                if (j == 3) {
                    System.out.print(BLANK);
                }
                System.out.print(STAR);
            }
            System.out.println();
        }
    }
//    public void print() {
//        for (int i = 1; i <= line; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(STAR);
//            }
//            System.out.println();
//        }
//    }

}
