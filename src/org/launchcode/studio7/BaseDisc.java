package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private String capacity;

    public BaseDisc(String name, String capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String content() {
        return "Name: "+this.getName()+"\nCapacity: "+this.getCapacity();
    }

}
