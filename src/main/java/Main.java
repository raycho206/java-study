import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {


//        int[] observers = null;
////        int[] observers = {1, 2, 3};
//        for (int i : observers) {
//            System.out.println(i);
//        }

//        final LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("문자1");
//        linkedHashSet.add("문자2");
//        for (String s : linkedHashSet) {
//            System.out.println(s);
//        }

//        Scanner scanner = new Scanner("\n\na\n\nb\n\n\n");
//        System.out.println("=====");
//        while (scanner.hasNext()) {
//            System.out.println("출력: " + scanner.next());
//        }
//        System.out.println("=====");

//        boolean run = true;
//        int speed = 0;
//        int keyCode = 0;
//
//        while (run) {
//            if (keyCode != 13 && keyCode != 10) {
//                System.out.println("======");
//                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
//                System.out.println("======");
//            }
//
//            keyCode = System.in.read();
//
//            if (keyCode == 49) {
//                speed++;
//                System.out.println("현재 속도=" + speed);
//            } else if (keyCode == 50) {
//                speed--;
//                System.out.println("현재 속도=" + speed);
//            } else if (keyCode == 51) {
//                run = false;
//            }
//        }
//
//        System.out.println("프로그램 종료");

//        String s1 = "자바";
//        String s2 = "자바";
//        System.out.println(Arrays.toString(s1.getBytes()));
//        System.out.println(Arrays.toString(s2.getBytes()));
//        char c1 = 'A';
//        String s3 = "A";
//        System.out.println(c1 == s3.charAt(0));

//        double v4 = 0.1;
//        float v5 = 0.1f;
//        System.out.println(v4 == v5);
//        System.out.println((float) v4 == v5);
//        System.out.println(v4 == (double) v5);
//        System.out.println("v4: " + (float) v4);
//        System.out.println("v5: " + (double) v5);

//        char charA = 'A';
//        char charB = 'B';
//        boolean booleanValue = charA < charB;

//        String strValue = "NaN";
//        double doubleNaN = Double.valueOf(strValue);
//        double doubleValue = 100.0;
//        System.out.println(doubleValue * doubleNaN);

//        System.out.println(5 % 0.0);
//
//        double doubleValue = 5 / 0.0;
//        System.out.println(Double.isInfinite(doubleValue));
//        System.out.println(Double.isNaN(doubleValue));

//        int intValue = 1;
//        double result = 1 / 0.3;
//        System.out.println(result);

//        System.out.println("Integer.Max: " + Integer.MAX_VALUE);
//        System.out.println("Integer.Min: " + Integer.MIN_VALUE);
//        int i20e8 = 2000000000;
//        System.out.println("Integer.MAX_VALUE - i20e8: " + (Integer.MAX_VALUE - i20e8));
//        if (i20e8 > Integer.MAX_VALUE - i20e8) {
//            System.out.println("오버플로우");
//        } else {
//            System.out.println("이상없음");
//        }

//        System.out.println("Byte.Max: " + Byte.MAX_VALUE);
//        byte b100 = -1;
//        byte byteValue = -127;
//        if (b100 > Byte.MAX_VALUE - byteValue) {
//            System.out.println("오버플로우");
//        } else {
//            System.out.println("계산");
//        }

//        if (b100 < Byte.MIN_VALUE - byteValue) {
//            System.out.println("오버플로우");
//        } else {
//            System.out.println("계산");
//        }

//        System.out.println(Math.pow(2, 63));

//        char c1 = 'A' + 63; // 65 + 63 => 128
//        System.out.println("c1: " + (byte) c1);
//
//        int i1 = 'A' + 1;
//        System.out.println("i1: " + i1);

//        String strValue = "a에";
//        System.out.println(strValue.length());
//        System.out.println(strValue.getBytes().length);
//        char var = strValue.charAt(0);
//        System.out.println(var);

//        double doubleValue = 10011111111.0;
//        System.out.println("double: " + doubleValue);
//
//        int intValue = (int) doubleValue;
//        System.out.println("int: " + intValue);
//
//        float floatValue = (float) doubleValue;
//        System.out.println("float: " + floatValue);
//
//        Double.MAX_VALUE;

//        int value = 10;
//        int result = value + 1;
//
//        byte byte1 = 1;
//        byte byte2 = 2;
//        byte byte127 = 127;
//        byte byte_128 = -128;
//
//        int unicode_A = 'A';
//        System.out.println(unicode_A);

//        StarImprint star = new StarImprint(3);
//        star.print();

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        for (int i : list) {
//            System.out.println("list item: " + i);
//        }

//        p725();
//        p726();
//        p729();
//        p737();
//        p741();

//        10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
//        1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
//        sum(999);

//        List<String> stringList = new ArrayList<>();
//        stringList.add("a");
//        stringList.add("b");
//        stringList.add("c");
//        reverse(stringList);
//        for (String s : stringList) {
//            System.out.println(s);
//        }
//
//        String returnString = stringList.set(1, "e");
//        System.out.println("returnString: " + returnString);
//        for (String s : stringList) {
//            System.out.println(s);
//        }

//        InitializationOnDemandHolderIdiom.getInstance();

//        String string = "abc";
//        JString jString = new JString("abc");
//        boolean isEquals = jString.equals(string);
//        if (isEquals) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
    }

//    private static void reverse(List<?> list) {
//        List<?> reverseList = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i);
//            reverseList.add();
//        }
//    }

    private static void sum(int number) {
        int result = 0;

        List<Integer> threeMultipleList = multiple(number, 3);
        List<Integer> fiveMultipleList = multiple(number, 5);

        for (int i = 0; i < threeMultipleList.size(); i++) {
            int three = threeMultipleList.get(i);
            result += three;
//            System.out.println(threeMultipleList.get(i));
        }
        for (int i = 0; i < fiveMultipleList.size(); i++) {
            int five = fiveMultipleList.get(i);
            result += five;
//            System.out.println(fiveMultipleList.get(i));
        }

        System.out.println("result: " + result);
    }

    private static List<Integer> multiple(int number, int multiple) {
        List<Integer> multipleList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (i % multiple == 0) {
                multipleList.add(i);
            }
        }

        return multipleList;
    }

    private static void p741() {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hashMap.put("i" + i, i);
        }

        System.out.println("keySet()을 사용");
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = hashMap.get(key);

            System.out.println("key: " + key + " value: " + value);

        }

        System.out.println();
        System.out.println("entrySet() 사용");
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key: " + key + " value: " + value);
        }
    }

    private static void p737() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("홍길동");
        hashSet.add("성춘향");
        hashSet.add("이몽룡");
        hashSet.add("최집사");
        hashSet.add("김사또");

        System.out.println("향상된 for문");
        for (String str : hashSet) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("Iterator 사용");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    private static void p729() {
        List<String> list = Arrays.asList("홍길동", "성춘향");
        for (String name : list) {
            System.out.println(name);
        }
    }

    private static void p726() {
        List<String> list = new ArrayList<>();
    }

    /**
     * p725 List 컬렉션
     */
    private static void p725() {
        List<String> list = new ArrayList<>();
        list.add("홍길동"); // 0 삭제
        list.add("홍길동"); // 1 0
        list.add("성춘향"); // 2 1

//        System.out.println(list.remove("홍길동"));

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (name.equals("홍길동")) {
                list.remove("홍길동");
            }
            System.out.println(i + "번째: " + list.get(i));
        }
    }

    private void showPersonClassInfo() throws ClassNotFoundException {
//        Person person = new Person();
//        Class clazz = Class.forName(person.getClass().getCanonicalName());
//
//        Field[] fields = clazz.getDeclaredFields();
//        System.out.println("선언된 필드 출력");
//        for (Field field : fields) {
//            System.out.print("접근 제한자 : " + field.getModifiers() + "  ");
//            System.out.print("타입 : " + field.getType().toString() + "  ");
//            System.out.print("변수명 : " + field.getName() + "  ");
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println("선언된 메소드 출력");
//        Method[] methods = clazz.getDeclaredMethods();
//        for (Method myFuncMethod : methods) {
//            System.out.print("접근 제한자 : " + myFuncMethod.getModifiers() + "  ");
//            System.out.print("접근 리턴 타입 : " + myFuncMethod.getReturnType() + "  ");
//            System.out.print("메소드 명 : " + myFuncMethod.getName());
//            Class[] params = myFuncMethod.getParameterTypes();
//            for (Class param : params) {
//                System.out.print("파라미터 타입 " + param.getName() + ",  ");
//            }
//            System.out.println();
//        }
    }

}
