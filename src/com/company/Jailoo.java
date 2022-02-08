package com.company;

public class Jailoo {
    private String name;
    private String address;
    private String owner;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;

    public Jailoo(String name, String address, String owner, Cow[] cows, Sheep[] sheeps, Horse[] horses) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }
}
