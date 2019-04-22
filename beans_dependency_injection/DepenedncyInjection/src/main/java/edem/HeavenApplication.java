package edem;

import garden.Garden;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HeavenApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Garden edemGarden = context.getBean("heaven", EdemGarden.class);
        edemGarden.showInfo();
        context.close();
    }
}
