package com.besteco.javaTutorial.observerPattern;

public class MessageSubscriberTwo  implements Observer{

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo ::" + m.getMessageContent());
    }
}
