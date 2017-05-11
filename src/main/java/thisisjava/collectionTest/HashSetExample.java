package thisisjava.collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.sno + ":" + student.name);
        }
    }

    private static class Student {
        int sno;
        String name;

        public Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return sno;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Student) {
                Student student = (Student) obj;

                return (sno == student.sno);
            } else {
                return false;
            }
        }
    }

}
