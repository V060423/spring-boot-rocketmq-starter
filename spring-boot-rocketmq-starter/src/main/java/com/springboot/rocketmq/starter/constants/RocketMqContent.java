package com.springboot.rocketmq.starter.constants;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * @author wangbowen
 * @Description 消息内容
 * @Date 2018/5/10 9:43
 */
public class RocketMqContent implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * FastJSON serialize
     * @return content json string
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.NotWriteDefaultValue);
    }
}
