package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/30.
 */
  public  class SpringBoot {
     private static ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
