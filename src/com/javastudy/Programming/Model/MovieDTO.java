package com.javastudy.Programming.Model;

public class MovieDTO {
    private String title;
    private String day;
    private String actor;
    private String genre;
    private int time;
    private int minAge;

    public MovieDTO(){
    }
    public MovieDTO(String title, String day, String actor,
                    String genre, int time, int minAge) {
        this.title = title;
        this.day = day;
        this.actor = actor;
        this.genre = genre;
        this.time = time;
        this.minAge = minAge;
    }

    public void setTitle(String title) { this.title = title; }
    public void setDay(String day) { this.day = day; }
    public void setActor(String actor) { this.actor = actor; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setTime(int time) { this.time = time; }
    public void setMinAge(int minAge) { this.minAge = minAge; }
    public String getTitle(){ return this.title; }
    public String getDay() { return this.day; }
    public String getActor() { return this.actor; }
    public String getGenre() { return this.genre; }
    public int getTime() { return this.time; }
    public int getMinAge() { return this.minAge; }
    
    public String toString(){
        return title + "\t" + day + "\t" + actor + "\t" +
                genre + "\t" + time + "분\t" + minAge + "세";
    }
}
