package java_collections.main_task.electricalAppliances;

import java_collections.main_task.specifications.EnergyConsumptionClass;
import java_collections.main_task.specifications.NoiseLevel;

public class HomeCleaningAppliances extends Appliance {
    private EnergyConsumptionClass energyConsumptionClass;
    private NoiseLevel noiseLevel;

    public HomeCleaningAppliances(String model, String brand, long weight, int powerConsumption, EnergyConsumptionClass energyConsumptionClass, NoiseLevel noiseLevel) {
        super(model, brand, weight, powerConsumption);
        this.energyConsumptionClass = energyConsumptionClass;
        this.noiseLevel = noiseLevel;
    }

    public EnergyConsumptionClass getEnergyConsumptionClass() {
        return energyConsumptionClass;
    }

    public NoiseLevel getNoiseLevel() {
        return noiseLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeCleaningAppliances that = (HomeCleaningAppliances) o;

        if (energyConsumptionClass != that.energyConsumptionClass) return false;
        return noiseLevel == that.noiseLevel;
    }

    @Override
    public int hashCode() {
        int result = energyConsumptionClass != null ? energyConsumptionClass.hashCode() : 0;
        result = 31 * result + (noiseLevel != null ? noiseLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("}",
                ", energyConsumptionClass=" + energyConsumptionClass +
                        ", noiseLevel=" + noiseLevel +
                        '}');
    }
}
