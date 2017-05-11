//package stream;
//
//import domain.Keyboard;
//import domain.KeyboardType;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.hamcrest.CoreMatchers.hasItem;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.not;
//import static org.junit.Assert.assertThat;
//
//
//public class KeyboardSearchTest {
//
//    @Before
//    public void setUp() throws Exception {
//        Keyboard.initilizeID();
//    }
//
//    @Test
//    public void testKeyboardId() {
//        Keyboard keyboard01 = new Keyboard("x", KeyboardType.BLACK, 100, LocalDate.now());
//        Keyboard keyboard02 = new Keyboard("x", KeyboardType.BLACK, 100, LocalDate.now());
//        Keyboard keyboard03 = new Keyboard("x", KeyboardType.BLACK, 100, LocalDate.now());
//
//        assertThat(keyboard01.getSerialNumber(), is("KB-00000001"));
//        assertThat(keyboard02.getSerialNumber(), is("KB-00000002"));
//        assertThat(keyboard03.getSerialNumber(), is("KB-00000003"));
//    }
//
//    @Test
//    public void testKeyboardCost() throws Exception {
//        Keyboard keyboard;
//        for (int i = 0; i < 100; i++) {
//            keyboard = new Keyboard("x", KeyboardType.BLACK, getRandomCost(), LocalDate.now());
//
//            int price = keyboard.getPrice();
//            assertThat((price >= 100000) && (price <= 500000), is(true));
//        }
//    }
//
//    @Test
//    public void testKeyboardName() throws Exception {
//        List<String> nameList = Arrays.asList(
//                "leopold", "realforce", "happyhacking", "hansung", "abko");
//
//        Keyboard keyboard;
//        for (int i = 0; i < 1000; i++) {
//            keyboard = new Keyboard(getRandomName(nameList), KeyboardType.BLACK, 100, LocalDate.now());
//
//            assertThat(nameList, hasItem(keyboard.getName()));
//        }
//    }
//
//    private String getRandomName(List<String> nameList) {
//        int randomIdx = (int) (Math.random() * nameList.size());
//
//        return nameList.get(randomIdx);
//    }
//
//    private int getRandomCost() {
//        return (int) (Math.random() * 400001) + 100000;
//    }
//
//}
