package javacollections.maintask.electricalAppliances;

import javacollections.maintask.specifications.ScreenTechnology;

public class ComputerEngineeringAppliances extends Appliance {
    private ScreenTechnology screenTechnology;

    public ComputerEngineeringAppliances(String model, String brand, long weight, int powerConsumption, ScreenTechnology screenTechnology) {
        super(model, brand, weight, powerConsumption);
        this.screenTechnology = screenTechnology;
    }

    public ScreenTechnology getScreenTechnology() {
        return screenTechnology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerEngineeringAppliances that = (ComputerEngineeringAppliances) o;

        return screenTechnology == that.screenTechnology;
    }

    @Override
    public int hashCode() {
        return screenTechnology != null ? screenTechnology.hashCode() : 0;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}",
                ", screenTechnology=" + screenTechnology +
                        '}');
    }
}
