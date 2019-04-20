package com.lh.config;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class KaptchaConfig {

    @Bean
    public Producer getProducer(){
        //获取验证码生成对象
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        //验证码管理工具properties
        Properties properties = new Properties();
        properties.setProperty(Constants.KAPTCHA_BORDER,"no");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH,"4");
        properties.setProperty(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR,"black");
        properties.setProperty(Constants.KAPTCHA_NOISE_COLOR,"blue");

        //验证码生效
        Config config = new Config(properties);
        kaptcha.setConfig(config);

        return kaptcha;
    }

}
