package com.netfliclient.demo;

import com.netfliclient.demo.Feign.SubscriberFeign;
import com.netfliclient.demo.model.Subscriber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestClient implements CommandLineRunner {
    private SubscriberFeign subscriberFeign;

    public RestClient(SubscriberFeign subscriberFeign) {
        this.subscriberFeign = subscriberFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        // adding a new subscriber
        Subscriber add_subscriber = subscriberFeign.newSubscriber(new Subscriber("Humphrey Matagaro", 94568));

    }
}