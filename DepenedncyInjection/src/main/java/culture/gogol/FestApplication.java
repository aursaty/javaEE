package culture.gogol;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FestApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GogolFest gogolFest = context.getBean(GogolFest.class);
        gogolFest.getEventInfo();
        context.close();
    }
}
