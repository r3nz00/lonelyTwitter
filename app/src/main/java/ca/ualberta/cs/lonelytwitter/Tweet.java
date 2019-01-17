package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/*
In order to make this application a bit more object oriented we needed to create a Tweet class
to hold tweet message and the date it was tweeted
 */
public class Tweet {
    private String message;
    private Date date; // as of right now date actually does nothing

    /*
    The next two functions are constructors -- these are called when we initialize a new Tweet
    object. Why do we need two? The first one is called when no parameters are passed while the
    second one is called when a String parameter is passed. This is done just in case we need
    to initialize a Tweet object without knowing the tweet message.
     */
    public Tweet() {
        /*
        An example of Java code when this constructor is called:
        Tweet tweets = new Tweet();
         */
        this.message = "";
    }

    public Tweet(String message) {
        /*
        An example of Java code when this constructor is called:
        Tweet tweets = new Tweet("The undesirable jackals")
         */
        this.message = message;
    }

    public void setMessage(String message) {
        /*
        A setter method -- used to set tweet message. This is done to maintain encapsulation -- a
        topic we learned in one of our lectures.
         */
        this.message = message;
    }

    public String getMessage() {
        /*
        A getter method -- used to get tweet message. This is done to maintain encapsulation -- a
        topic we learned in one of our lectures. In practice, getter methods are important to
        keep abstraction (i.e blackboxing). Users dont have to know how the method is
        implemented as long as we return the method returns the correct output.

         */
        return this.message;
    }

    /*
    Overide is quite popular in object oriented programming. This is used to overide methods from
    the super class. ALWAYS REMEMBER: ALL CLASSES IN JAVA INHIRETS OBJECT CLASS!! and Object class
    has a method toString which returns memory address of the class and some more info (Devin knows
    more about the sorcery behind Object class)
     */
    @Override
    public String toString() {
        /*
        For our purposes, we dont want memory address (and more) when we call the toString method.
        We want to get the message of this Tweet object.
         */
        return(this.message );
    }


}
