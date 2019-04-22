package culture.cosmos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
class AppConfig {
    @Bean
    public CosmosTrain getTrain() {
        CosmosTrain cosmosTrain = new CosmosTrain();
        cosmosTrain.setName("CosmosTrain");
        return cosmosTrain;
    }
}
