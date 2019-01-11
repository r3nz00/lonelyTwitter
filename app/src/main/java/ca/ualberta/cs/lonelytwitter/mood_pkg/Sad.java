package ca.ualberta.cs.lonelytwitter.mood_pkg;

import java.util.Date;

public class Sad extends Mood {
    private String mood = "Sad";
    public Sad(){
        super();
    }
    public Sad(Date set_date) {
        super(set_date);
    }

    public String getMood() {
        return this.mood;
    }
}