package unit1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;
import unit1.config.KnightConfig;

public class KnightMain {

  public static void main(String[] args) throws Exception {
//    ClassPathXmlApplicationContext context =
//        new ClassPathXmlApplicationContext(
//            "META-INF/spring/knight.xml");
    ApplicationContext context= new AnnotationConfigApplicationContext(KnightConfig.class);
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();

  }

}
