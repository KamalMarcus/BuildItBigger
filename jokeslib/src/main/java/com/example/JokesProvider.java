package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class JokesProvider {
    public static JokesProvider instance=null;
    public static ArrayList<String> jokesList;
    String joke1="Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.";
    String joke2="My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.";
    String joke3="A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.”\n" +
            "\n" +
            "The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.” ";
    String joke4="Anton, do you think I’m a bad mother?\n" +
            "\n" +
            "My name is Paul.";
    String joke5="Dentist: \"You need a crown.\"\n" +
            "-\n" +
            "Patient: \"Finally someone who understands me\"";
    String joke6="I heard women love a man in uniform. Can’t wait to start working at McDonalds.";

    public JokesProvider(){
        jokesList=new ArrayList<String>();
        jokesList.add(joke1);
        jokesList.add(joke2);
        jokesList.add(joke3);
        jokesList.add(joke4);
        jokesList.add(joke5);
        jokesList.add(joke6);
    }

    public static JokesProvider getInstance(){
        if(instance==null){
            instance= new JokesProvider();
        }
        return instance;
    }

    public static String getRandomJoke(){
        Collections.shuffle(jokesList);
        return jokesList.get(0);
    }
}
