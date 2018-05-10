package com.springboot.rocketmq.starter.constants;

/**
 * 消费模式
 */
public enum ConsumeMode {
    /**
     * receive asynchronously delivered messages concurrently
     */
    CONCURRENTLY,

    /**
     * receive asynchronously delivered messages orderly. one queue, one thread
     */
    Orderly
}
