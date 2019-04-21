package culture.gogol;

import culture.Fest;
import culture.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class GogolFest implements Fest {

    private Train mTrain;

    @Autowired
    public GogolFest(Train train) {
        this.mTrain = train;
    }

    public void getEventInfo() {
        System.out.println(mTrain.getName());
    }

}
