package thisisjava.collectionTest;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        for (Student student : treeSet) {
            System.out.println(student.score);
        }
        System.out.println();

        Student student = treeSet.last();
        System.out.println("최고점수: " + student.score);
        System.out.println("최고점수를 받은 아이디: " + student.id);
    }

    private static class Student implements Comparable<Student> {
        String id;
        int score;

        public Student(String id, int score) {
            this.id = id;
            this.score = score;
        }

        @Override
        public int compareTo(Student o) {
            if (score < o.score) return -1;
            else if (score == o.score) return 0;
            else return 1;
        }
    }

}
