package net.cloudburo.drools.model;

public class Patient {
    private String gender;
    private String age;
    private String race;

    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getGender() {
        return gender;
    }

    public String heheGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public enum RaceType {
        CHINESE,
        MALAY,
    }
}