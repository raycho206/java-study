package thisisjava.streamTest;

public class Member {
    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private String job;
    private int sex;
    private int age;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Member(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

}
