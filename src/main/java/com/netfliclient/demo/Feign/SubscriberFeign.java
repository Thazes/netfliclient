package com.netfliclient.demo.Feign;

import com.netfliclient.demo.FeignConfig;
import com.netfliclient.demo.model.Subscriber;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "subscribers",url = "http://netflixserverproject.herokuapp.com", configuration = FeignConfig.class)
public interface SubscriberFeign {
    @RequestMapping(method = RequestMethod.POST, value = "subscribers")
    Subscriber newSubscriber(@RequestBody Subscriber subscriber);
}
