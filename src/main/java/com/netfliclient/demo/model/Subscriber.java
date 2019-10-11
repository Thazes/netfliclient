package com.netfliclient.demo.model;

public class Subscriber {
    private int subscriberid;
    private int subscribername;

    public Subscriber(int subscriberid, int subscribername) {
        this.subscriberid = subscriberid;
        this.subscribername = subscribername;
    }

    public int getSubscriberid() {
        return subscriberid;
    }

    public void setSubscriberid(int subscriberid) {
        this.subscriberid = subscriberid;
    }

    public int getSubscribername() {
        return subscribername;
    }

    public void setSubscribername(int subscribername) {
        this.subscribername = subscribername;
    }
}
