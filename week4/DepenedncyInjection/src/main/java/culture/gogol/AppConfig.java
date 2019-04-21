package culture.gogol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
class AppConfig {

    @Bean
    public GogolTrain getTrain() {
        return new GogolTrain("Gogol");
    }

}