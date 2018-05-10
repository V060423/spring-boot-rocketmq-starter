package com.springboot.rocketmq.demo;

import com.springboot.rocketmq.starter.constants.RocketMqTopic;

/**
 * @author rhwayfun
 * @since 0.0.1
 */
public class DemoRocketMqTopic implements RocketMqTopic {
    @Override
    public String getTopic() {
        return "TopicA";
    }
}
