package org.example.Model;

public class SponsorGeschenk {
    private int id;
    private int tributId;
    String itemName;
    int value;
    int day;

    SponsorGeschenk(int id, int tributId, String itemName, int value, int day){
        this.id = id;
        this.tributId = tributId;
        this.itemName = itemName;
        this.value = value;
        this.day = day;
    }

    SponsorGeschenk(){}

    public int getId(){
        return id;
    }

    public int getDay() {
        return day;
    }

    public int getTributId() {
        return tributId;
    }

    public int getValue() {
        return value;
    }

    public String getItemName() {
        return itemName;
    }

    public void setTributId(int tributId) {
        this.tributId = tributId;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
