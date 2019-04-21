package culture.cosmos;

import culture.Fest;
import culture.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CosmosTabir implements Fest {

    private Train mTrain;

    CosmosTabir() {
    }

    Train getTrain() {
        return mTrain;
    }

    @Autowired
    void setTrain(CosmosTrain train) {
        mTrain = train;
    }

    public void getEventInfo() {
        System.out.println(mTrain.getName());
    }

}
