package com.springboot.rocketmq.demo;


import com.springboot.rocketmq.starter.constants.RocketMqTag;

/**
 * @author rhwayfun
 * @since 0.0.1
 */
public class DemoRocketMqTag implements RocketMqTag {
    @Override
    public String getTag() {
        return "TagA";
    }
}
