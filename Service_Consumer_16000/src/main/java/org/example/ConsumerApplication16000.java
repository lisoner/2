package org.example;

import org.example.rule.CustomLoadBalancerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.openfeign.


@SpringBootApplication
@Enable
@LoadBalancerClient(name="provider-server",configuration= CustomLoadBalancerConfig.class)//负载均衡策略 对于provider-server种类的服务 需要使用CustomLoadBalancerConfig.class里的策略来均衡
public class ConsumerApplication16000 {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerApplication16000.class,args);
    }
}
