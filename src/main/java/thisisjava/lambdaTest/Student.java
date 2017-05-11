package thisisjava.lambdaTest;

public class Student {
    private String name;
    private int englishScore;
    private int mathScore;
    private String gender;
    private int score;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public String getGender() {
        return gender;
    }

    public int getScore() {
        return score;
    }
}
