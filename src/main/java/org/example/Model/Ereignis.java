package org.example.Model;

public class Ereignis {

    private int id;
    private int tributId;
    private EventTyp typ;
    private int points;
    private int day;

    Ereignis(int id, int tributId, EventTyp typ, int points, int day)
    {
        this.id = id;
        this.tributId = tributId;
        this.typ = typ;
        this.points = points;
        this.day = day;
    }

    Ereignis(){}

    public int getId(){
        return id;
    }

    public int getPoints(){
        return points;
    }

    public int getTributId(){
        return tributId;
    }

    public EventTyp getTyp(){
        return typ;
    }

    public int getDay(){
        return day;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setTributId(int tributId) {
        this.tributId = tributId;
    }

    public void setTyp(EventTyp typ) {
        this.typ = typ;
    }
}
