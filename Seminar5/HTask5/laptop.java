package Seminar5.HTask5;

public class laptop {
    int id;
    int ram;
    int ssd;
    String os;
    String color;

    public laptop(int id, int ram, int ssd, String os, String color){
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", id, ram, ssd, os, color);
    }

    public boolean equals(Object o) {
        laptop t = (laptop) o;
        return id == t.id;
    }
}
