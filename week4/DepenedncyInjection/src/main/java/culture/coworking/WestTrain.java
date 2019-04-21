package culture.coworking;

import culture.Train;

public class WestTrain implements Train {

    private String name;

    public WestTrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
