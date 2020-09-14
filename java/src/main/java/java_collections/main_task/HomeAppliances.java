package java_collections.main_task;

import java_collections.main_task.electricalAppliances.Appliance;
import java_collections.main_task.electricalAppliances.CookingFoodAppliances;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Home electrical appliances. Determine the hierarchy of electrical appliances. Plug some into a power outlet.
 * Calculate the power consumption. Sort the appliances in the apartment based on power.
 * Find the appliance in the apartment that matches the specified range of parameters.
 */
public class HomeAppliances {

    private List<? extends Appliance> appliances;

    public HomeAppliances(List<? extends Appliance> appliances) {
        this.appliances = appliances;
    }

    public List<? extends Appliance> getAppliances() {
        return appliances;
    }

    public List<CookingFoodAppliances> turningOnAppliances() {
        List<CookingFoodAppliances> turnedOnAppliances = new ArrayList<>();
        for (Appliance appliance : appliances) {
            if (appliance instanceof CookingFoodAppliances) {
                turnedOnAppliances.add((CookingFoodAppliances) appliance);
            }
        }
        return turnedOnAppliances;
    }

    public long calculateTheTotalPowerConsumptionForTurnedOnAppliances() {
        List<CookingFoodAppliances> turnedOnAppliances = turningOnAppliances();
        long totalPowerConsumption = 0;
        for (CookingFoodAppliances appliances : turnedOnAppliances) {
            totalPowerConsumption += (appliances.getPowerConsumption());
        }
        return totalPowerConsumption;
    }

    class HomeAppliancesCompare implements Comparator<Appliance> {
        @Override
        public int compare(Appliance o1, Appliance o2) {
            return (o1.getPowerConsumption() - o2.getPowerConsumption());
        }
    }

    public HomeAppliances sortByPowerConsumption() {
        HomeAppliancesCompare homeAppliancesCompare = new HomeAppliancesCompare();
        Collections.sort(appliances, homeAppliancesCompare);
        return this;
    }

    public Collection<? extends Appliance> findTheApplianceThatMatchesTheSpecifiedRangeOfParameters(String searchName, int searchWeight, int powerConsumption) {
        Collection<? extends Appliance> findList = appliances
                .stream()
                .filter(e -> e.getPowerConsumption() > powerConsumption
                        && e.getWeight() > searchWeight
                        && e.getBrand().equalsIgnoreCase(searchName))
                .collect(Collectors.toCollection(ArrayList::new));
        return findList;
    }

    @Override
    public String toString() {
        return "HomeAppliances{" +
                "appliances=" + appliances +
                "\n" +
                '}';
    }
}

