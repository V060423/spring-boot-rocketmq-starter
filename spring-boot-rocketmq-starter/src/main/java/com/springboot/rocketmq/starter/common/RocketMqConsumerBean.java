package com.springboot.rocketmq.starter.common;

import java.util.List;

/**
 * @author wangbowen
 * @Description 消费者
 * @Date 2018/5/10 10:00
 */

public class RocketMqConsumerBean{

    /**
     * consumer beans container.
     *
     */
    private List<AbstractRocketMqConsumer> consumers;

    public List<AbstractRocketMqConsumer> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<AbstractRocketMqConsumer> consumers) {
        this.consumers = consumers;
    }

}
