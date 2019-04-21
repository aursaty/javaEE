package culture.coworking;

import culture.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

    @Bean
    ArrayList<Train> getTrains() {
        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new WestTrain("WestTrain to SZIGET!"));
        trains.add(new EastTrain("EastTrain to SZIGET!"));
        return trains;
    }

}
