package javacollections.maintask.electricalAppliances;

import java.util.Objects;

public abstract class Appliance {
    private String model;
    private String brand;
    private long weight;
    private int powerConsumption;

    public Appliance(String model, String brand, long weight, int powerConsumption) {
        this.model = model;
        this.brand = brand;
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public long getWeight() {
        return weight;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        if (weight != appliance.weight) return false;
        if (powerConsumption != appliance.powerConsumption) return false;
        if (!Objects.equals(model, appliance.model)) return false;
        return Objects.equals(brand, appliance.brand);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (int) (weight ^ (weight >>> 32));
        result = 31 * result + (powerConsumption ^ (powerConsumption >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight + "kg" +
                ", powerConsumption=" + powerConsumption + "W" +
                '}';
    }
}
