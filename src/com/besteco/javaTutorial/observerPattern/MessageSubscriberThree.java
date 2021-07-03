package com.besteco.javaTutorial.observerPattern;

public class MessageSubscriberThree implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree ::" + m.getMessageContent());
    }
}
