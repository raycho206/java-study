//package kata;
//
//import org.junit.Test;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.*;
//
//public class LongestConsecTest {
//
//    private static void testing(String actual, String expected) {
//        assertEquals(expected, actual);
//    }
//
//   // @Test
//    public void test() {
//        System.out.println("longestConsec Fixed Tests");
//        testing(LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
///*        testing(LongestConsec.longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
//        testing(LongestConsec.longestConsec(new String[]{}, 3), "");
//        testing(LongestConsec.longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
//        testing(LongestConsec.longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
//        testing(LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
//        testing(LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
//        testing(LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
//        testing(LongestConsec.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");*/
//    }
//
//    @Test
//    public void testByString() {
//        String[] stringArr = new String[]{"a", "ab", "abc", "d"};
//
//        String result = LongestConsec.maxByLength(stringArr);
//
//        assertThat(result, is("abc"));
//    }
//
//    @Test
//    public void testByTwoString() {
//        String[] stringArr = new String[]{"a", "ab", "abc", "d"};
//
//        String result = LongestConsec.maxByTwoLength(stringArr);
//
//        assertThat(result, is("ababc"));
//    }
//
//}