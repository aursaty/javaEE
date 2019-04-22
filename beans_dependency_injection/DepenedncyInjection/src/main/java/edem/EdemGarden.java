package edem;

import garden.Garden;
import garden.Heaven;

class EdemGarden implements Garden {

    private Heaven mHeaven;

    public EdemGarden(Edem garden) {
        this.mHeaven = garden;
    }

    public void showInfo() {
        System.out.println(mHeaven.getName());
    }

}
