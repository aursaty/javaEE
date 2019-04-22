package culture.coworking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoworkingApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SzigetFest szigetFest = context.getBean(SzigetFest.class);
        szigetFest.getEventInfo();
        context.close();
    }
}
