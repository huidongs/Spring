package pers.huidong.spring_ioc.demo8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_ioc
 * @auther: HuiDong
 * @date: 2020/4/13 15:31
 * @description:
 */
public class SpringDemo8 {
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService   = (ProductService) applicationContext.getBean("productService");
        productService.save();
    }
}
