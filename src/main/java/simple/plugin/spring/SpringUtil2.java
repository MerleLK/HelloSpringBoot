package simple.plugin.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/** 不在spring-boot扫描包之下的util使用
 * todo 需要进一步学习  这些方法的不一样的作用
 * Created by merle on 17-5-31.
 */
public class SpringUtil2 implements ApplicationContextAware{

    private ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        if (SpringUtil2.this.applicationContext == null){
//            SpringUtil2.this.applicationContext = applicationContext;
//        }

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("----com.hello.base.util.SpringUtil-----");
        System.out.println("---ApplicationContext配置成功，此时可以在普通类中通过SpringUtil.getApplication()获得---");
        System.out.println("---applicationContext对象,applicationContext="+SpringUtil2.this.applicationContext+"---");
        System.out.println("--------------------------------------");
    }
}
