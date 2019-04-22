package culture.cosmos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class TabirApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CosmosTabir cosmosTrain = context.getBean(CosmosTabir.class);
        cosmosTrain.getEventInfo();
        context.close();
    }
}