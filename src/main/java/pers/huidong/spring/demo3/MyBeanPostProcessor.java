package pers.huidong.spring.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/12 1:18
 * @description: Bean后处理类
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步:初始化前方法...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第八步:初始化后的方法...");
        return bean;
    }
}
