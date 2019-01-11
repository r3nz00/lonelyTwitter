package ca.ualberta.cs.lonelytwitter.mood_pkg;

import java.util.Date;

public class Happy extends Mood {
    private String mood = "Happy";
    public Happy(){
        super();
    }
    public Happy(Date set_date) {
        super(set_date);
    }

    public String getMood() {
        return this.mood;
    }
}

