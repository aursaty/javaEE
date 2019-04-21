package culture.coworking;

import culture.Fest;
import culture.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SzigetFest implements Fest {

    private ArrayList<Train> mTrains;

    @Autowired
    public SzigetFest(ArrayList<Train> trains) {
        this.mTrains = trains;
    }

    public ArrayList<Train> getTrains() {
        return mTrains;
    }

    public void setTrains(ArrayList<Train> trains) {
        mTrains = trains;
    }

    public void getEventInfo() {
        mTrains.forEach(train -> System.out.println(train.getName()));
    }
}
