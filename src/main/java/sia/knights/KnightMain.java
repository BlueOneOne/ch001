package sia.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

  public static void main(String[] args) throws Exception {
//    ClassPathXmlApplicationContext context =
//        new ClassPathXmlApplicationContext(
//            "META-INF/spring/minstrel.xml");
//    Knight knight = context.getBean(Knight.class);
//    knight.embarkOnQuest();
//    context.close();

    //使用Java配置的方式，不用配置xml
    ApplicationContext contextConfig = new AnnotationConfigApplicationContext(sia.config.KnightConfig.class);
    Knight knight = contextConfig.getBean(Knight.class);
    knight.embarkOnQuest();
    ((AnnotationConfigApplicationContext) contextConfig).destroy();


  }

}
