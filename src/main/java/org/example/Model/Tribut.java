package org.example.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tribut {
    int id;
    String name;
    int distrikt;
    Status status;
    int skillLevel;

    Tribut(int id, String name, int distrikt, Status status, int skillLevel){
        this.id = id;
        this.name = name;
        this.distrikt = distrikt;
        this.status = status;
        this.skillLevel = skillLevel;
    }

    Tribut(){}

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getDistrikt(){
        return distrikt;
    }

    public Status getStatus(){
        return status;
    }

    public int getSkillLevel(){
        return skillLevel;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDistrikt(int distrikt){
        this.distrikt = distrikt;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString(){
       return this.id + " | "
               + this.name + " | " + " D"
               + this.distrikt + " | "
               + this.status + " | " + "skill="
               + this.skillLevel;
    }
}
