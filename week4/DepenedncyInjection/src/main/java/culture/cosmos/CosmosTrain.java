package culture.cosmos;

import culture.Train;

class CosmosTrain implements Train {

    private String name;

    public CosmosTrain() {
    }

    public CosmosTrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String trainName) {
        this.name = trainName;
    }
}