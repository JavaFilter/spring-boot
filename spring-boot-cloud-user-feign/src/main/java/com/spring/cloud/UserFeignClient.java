package com.spring.cloud;

import com.spring.cloud.Entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-boot-cloud-user")
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET )
    public User getUser(@PathVariable("id") String id);

    @RequestMapping(value = "/getUser",method = RequestMethod.GET )
    public User getUser1(@RequestBody User user);

}
