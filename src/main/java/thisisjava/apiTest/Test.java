package thisisjava.apiTest;

import java.util.*;

public class Test {

    public static void main(String[] args) {
//        Object object = new Object();
//        System.out.println("object: " + object.toString());
//
//        Date date = new Date();
//        System.out.println("data: " + date);
//        System.out.println("data.toString(): " + date.toString());

//        Counter counter = null;
//        for (int i = 0; i < 10; i++) {
//            counter = new Counter(i);
//            counter = null;
//            System.gc();
//        }

//        Counter c1 = new Counter(1);
//        Counter c2 = new Counter(2);
//        int counterComparatorResult = Objects.compare(c1, c2, new CounterComparator());
//        System.out.println(counterComparatorResult);

//        String text = "홍길동!이수홍@박연수";
//        StringTokenizer st = new StringTokenizer(text, "@|!");
//        System.out.println(st.countTokens());
//        while (st.hasMoreTokens()) {
//            String token = st.nextToken();
//            System.out.println(token);
//        }

//        String a1 = "a";
//        String a2 = "a";
//        String ab = "ab";
//        System.out.println("a1: " + (a1 == a2));
//        a2 = "ab";
//        System.out.println("ab: " + (ab == a2));

        StringBuilder sb = new StringBuilder();

        String[] strings = {"a", "bb", "ccc", "dddd"};
//        int bbIndex = Arrays.binarySearch(strings, "bb");
//        System.out.println("bbIndex: " + bbIndex);

//        String[] copyOfStrings = Arrays.copyOf(strings, 10);
//        String[] copyOfStrings = Arrays.copyOfRange(strings, 1, 5);
//        System.out.println("copyOfStrings.length: " + copyOfStrings.length);
//        System.out.print("copyOfStrings = {");
//        for (int i = 0; i < copyOfStrings.length; i++) {
//            System.out.print(copyOfStrings[i]);
//            if (i < copyOfStrings.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("}");
//
//        System.out.println(Arrays.toString(copyOfStrings));

//        String[] arr1 = {"1", "2", "3"};
//        String[] arr2 = {"가", "나"};
//        System.out.println("arr1[]: " + Arrays.toString(arr1));
//        System.out.println("arr2[]: " + Arrays.toString(arr2));
//        System.arraycopy(arr1, 0, arr2, 1, 1);
//        System.out.println("copy arr2[]: " + Arrays.toString(arr2));

//        int[] scores = {99, 97, 98};
//        System.out.println("정렬전: " + Arrays.toString(scores));
//        Arrays.sort(scores);
//        System.out.println("정렬후: " + Arrays.toString(scores));

//        int intValue = Integer.parseInt("100");

//        System.out.println(Math.floor(-5.7));

//        Random random = new Random();
//        Random randomSeed = new Random(System.currentTimeMillis());
//
//        int range = 5;
//        System.out.println("Random()");
//        for (int i = 0; i < range; i++) {
//            System.out.print(random.nextInt(10) + 1);
//            if (i < range - 1) {
//                System.out.print(", ");
//            }
//        }
//
//        System.out.println();
//        System.out.println("Random(seed)");
//        for (int i = 0; i < range; i++) {
//            System.out.print(randomSeed.nextInt(10) + 1);
//            if (i < range - 1) {
//                System.out.print(", ");
//            }
//        }

//        Date now = new Date();
//        System.out.println("now: " + now.toString());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//        System.out.println(sdf.format(now));

//        Calendar calendar = Calendar.getInstance();
//        String[] availableIDs = TimeZone.getAvailableIDs();
//        for (String s : availableIDs) {
//            System.out.println(s);
//        }

//        DecimalFormat df = new DecimalFormat("#,###.0");
//        System.out.println(df.format(1234567890));

//        LocalDate curDate = LocalDate.now();
//        System.out.println("curDate: " + curDate);
//        LocalDate targetDate = LocalDate.of(2024, 1, 1);
//        System.out.println("targetDate: " + targetDate);
//        LocalTime curTime = LocalTime.now();
//        System.out.println("curTime: " + curTime);
//        LocalTime targetTime = LocalTime.of(11, 1, 0);
//        System.out.println("targetTime: " + targetTime);
//        System.out.println("curDate.getMonth(): " + curDate.getMonth());
//        System.out.println("curDate.isLeapYear(): " + curDate.isLeapYear());
//        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
//        System.out.println("utcDateTime: " + utcDateTime);
//        System.out.println("nextOrSame: " + curDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));
//        System.out.println("next: " + curDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

//        LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
//        System.out.println("startDateTime: " + startDateTime);
//        LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
//        System.out.println("endDateTime: " + endDateTime);
//        System.out.println("startDateTime.until(): " + startDateTime.until(endDateTime, ChronoUnit.YEARS));
//        System.out.println("ChronoUnit.YEARS.between(): " + ChronoUnit.YEARS.between(startDateTime, endDateTime));
//        Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
//        System.out.println("duration: " + duration.getSeconds());
//
//        Object obj = new Object();
//        System.out.println(obj.toString());
//
//        String a = "123";
//
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
//        String string = sdf.format(date);
//        System.out.println(string);


    }

    public void cloneTest() {
        try {
            Object cloneObj = clone();
            Date date = new Date();
            date.clone();
        } catch (CloneNotSupportedException e) {

        }
    }

    private static class Counter {
        private int no;

        public Counter(int no) {
            this.no = no;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println(no + "번째 객체의 finalize() 실행됨");
        }
    }

    private static class CounterComparator implements Comparator<Counter> {
        @Override
        public int compare(Counter o1, Counter o2) {
            return Integer.compare(o1.no, o2.no);
        }
    }

}
