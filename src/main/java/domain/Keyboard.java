package domain;

import java.time.LocalDate;

public class Keyboard {
    private final String SERIAL_NUMBER; // 시리얼넘버
    private String name;                // 이름
    private KeyboardType type;          // 타입(청, 갈, 적, 흑)
    private int price;                  // 가격
    private LocalDate releasedDate;     // 제조일
    public static int currentID;

    static {
        currentID = 1;
    }

    public Keyboard(String name, KeyboardType type, int price, LocalDate releasedDate) {
        this.SERIAL_NUMBER = generateID();
        this.name = name;
        this.type = type;
        this.price = price;
        this.releasedDate = releasedDate;
    }

    private String generateID() {
        return String.format("KB-%08d", currentID++);
    }

    public String getSerialNumber() {
        return SERIAL_NUMBER;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeyboardType getType() {
        return type;
    }

    public void setType(KeyboardType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Keyboard keyboard = (Keyboard) o;

        return SERIAL_NUMBER != null ? SERIAL_NUMBER.equals(keyboard.SERIAL_NUMBER) : keyboard.SERIAL_NUMBER == null;

    }

    @Override
    public int hashCode() {
        return SERIAL_NUMBER != null ? SERIAL_NUMBER.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "SERIAL_NUMBER=" + SERIAL_NUMBER +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", releasedDate=" + releasedDate +
                '}';
    }

    public static void initilizeID() {
        currentID = 1;
    }
}
