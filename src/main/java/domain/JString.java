package main.java.domain;

/**
 * Custom String class
 */
public class JString {
    private String string;

    public JString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            // 우선 길이가 같은지 비교
            if (string.length() == ((String) obj).length()) {

                // 문자열의 길이만큼 반복하며...
                for (int i = 0; i < string.length(); i++) {
                    char char1 = string.charAt(i);
                    char char2 = ((String) obj).charAt(i);

                    // ... 문자를 바교
                    if (char1 == char2) {

                        // 마지막 문자까지 같으면 두 문자열이 같은 것으로 판단
                        if (i == string.length() - 1) {
                            return true;
                        }
                    }
                    // 문자가 같지 않을 때 return false;
                }
            }
        }

        // 위의 조건이 하나라도 안맞으면 같지 않음
        return false;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
