package fr.univlyon1.m1if.m1if03;

import java.util.ArrayList;

public class Messages extends Message {
    private ArrayList<Message> messages;
    public Messages(){
        messages = new ArrayList<>();
    }

    public void add(Message msg){
        messages.add(msg);

    }

    public ArrayList<Message> getMesages(){
        return messages;
    }

    public Message getMessage ( int i){
        return messages.get(i);
    }

    public void emptyMessages(){
        messages = new ArrayList<>();
    }
    public int getLength(){
        return messages.size();
    }

}
