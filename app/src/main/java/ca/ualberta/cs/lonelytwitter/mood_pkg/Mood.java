package ca.ualberta.cs.lonelytwitter.mood_pkg;

import android.text.method.DateTimeKeyListener;

import java.util.Date;

/*
Abstract base class which represents the current mood. Each mood should have a date
and setter to access the date.
*/
public abstract class Mood {
    private Date date_of_mood; // Ensures encapsulation

    // Constructor that sets current date to now
    public Mood() {
        this.date_of_mood = new Date();
    }

    // Constructor that takes a date as an argument
    public Mood(Date set_date) {
        this.date_of_mood = set_date;
    }

    // getter method for date of mood
    public Date get_date_of_mood() {
        return this.date_of_mood;
    }

    // setter method for date of mood
    public void set_date_of_mood(Date set_date) {
        this.date_of_mood = set_date;
    }

    public String getMood() {
        return "None";
    }

}
