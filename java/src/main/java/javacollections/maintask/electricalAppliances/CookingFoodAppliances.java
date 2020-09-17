package javacollections.maintask.electricalAppliances;

import javacollections.maintask.specifications.EnergyConsumptionClass;
import javacollections.maintask.specifications.Execution;

public class CookingFoodAppliances extends Appliance {
    private EnergyConsumptionClass energyConsumptionClass;
    private Execution execution;

    public CookingFoodAppliances(String model, String brand, long weight, int powerConsumption, EnergyConsumptionClass energyConsumptionClass, Execution execution) {
        super(model, brand, weight, powerConsumption);
        this.energyConsumptionClass = energyConsumptionClass;
        this.execution = execution;
    }

    public EnergyConsumptionClass getEnergyConsumptionClass() {
        return energyConsumptionClass;
    }

    public Execution getExecution() {
        return execution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CookingFoodAppliances that = (CookingFoodAppliances) o;

        if (energyConsumptionClass != that.energyConsumptionClass) return false;
        return execution == that.execution;
    }

    @Override
    public int hashCode() {
        int result = energyConsumptionClass != null ? energyConsumptionClass.hashCode() : 0;
        result = 31 * result + (execution != null ? execution.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}",
                ", energyConsumptionClass=" + energyConsumptionClass +
                        ", execution=" + execution +
                        '}');
    }
}
