package com.alan.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Controller类读取配置信息带前缀的字符串，
 * 比如我们要读取girl.cupSize=A girl.height=160
 * 这些带girl的配置信息，我们该怎么办呢。我们需要定义一个GirlProperties.java。
 * @ ConfigurationProperties代表我们要读取带什么前缀的配置信息，
 * @ Component代表这个类已经在Spring配置文件中注册过
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupSize;

    private  Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
