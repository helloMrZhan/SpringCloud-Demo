package com.zjq.springcloudconfigclient.web;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("hello")
public class HelloController {

    /**
     * github配置
     * @return
     */
//    @Value("${democonfigclient.message}")
//    private String hello;

    @Value("${hello.config}")
    private String hello;

    @RequestMapping(value="/config", method= RequestMethod.GET)
    public String config() {
        return this.hello;
    }
}
