package edem;

import garden.Heaven;

class Edem implements Heaven {

    private String name;

    Edem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
