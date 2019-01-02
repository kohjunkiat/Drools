package net.cloudburo.drools.model;

public class Label {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addValue(String value) {
        this.value = this.value+ " " + value;
    }

    public enum Racetype {
        CHINESE,
        MALAY,
    }
}
