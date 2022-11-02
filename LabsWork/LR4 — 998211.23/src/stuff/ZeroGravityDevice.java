package stuff;

import interfaces.WeightControlable;
import persons.Shorties;

public class ZeroGravityDevice implements WeightControlable {
    private Mineral mineral;
    private boolean onMode;

    public ZeroGravityDevice(Mineral mineral) {
        this.mineral = mineral;
        this.onMode = false;
    }

    public class Engine {
        private int magnetPower;
        private int magnetToMineralDistance;

        public Engine(int magnetPower, int magnetToMineralDistance) {
            this.magnetPower = magnetPower;
            this.magnetToMineralDistance = magnetToMineralDistance;
        }

        public void work(Shorties shorties) {
            if (onMode && magnetToMineralDistance<=1 && magnetPower>10) {
                changeWeight(shorties);
            }
            else {
                if (shorties.isFlying()) {
                    shorties.setFlying(false);
                    System.out.println(shorties.getName() + " приземлился");
                }
            }
        }
    }

    @Override
    public void changeWeight(Shorties shorties) {
        mineral.changeWeight(shorties);
    }

    public Mineral getMineral() {
        return mineral;
    }

    public void setMineral(Mineral mineral) {
        this.mineral = mineral;
    }

    public boolean isOnMode() {
        return onMode;
    }

    public void setOnMode(boolean onMode) {
        this.onMode = onMode;
    }
}
