package kata;

/**
 * https://www.codewars.com/kata/consecutive-strings/train/java
 */
public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {


        return null;
    }

    public static String maxByLength(String[] stringArr) {
        String max = stringArr[0];
        int maxLength = max.length();

        for (String s : stringArr) {
            if (maxLength < s.length()) {
                max = s;
            }
        }

        return max;
    }

    public static String maxByTwoLength(String[] stringArr) {
        String max = stringArr[0] + stringArr[1];
        int maxLength = max.length();

//        for (int i = 0; i < stringArr.length; i++) {
//            if (maxLength < 두개합친거의 길이) {
//                max = 두개합친거
//            }
//        }

        return max;
    }
}
