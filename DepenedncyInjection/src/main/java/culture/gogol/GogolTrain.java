package culture.gogol;

import culture.Train;

class GogolTrain implements Train {

    private String name;

    GogolTrain(String trainName) {
        this.name = trainName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
