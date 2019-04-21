package culture.coworking;

import culture.Train;

public class EastTrain implements Train {

    private String name;

    public EastTrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
