package javacollections.maintask;

import javacollections.maintask.electricalAppliances.Appliance;
import javacollections.maintask.electricalAppliances.ComputerEngineeringAppliances;
import javacollections.maintask.electricalAppliances.CookingFoodAppliances;
import javacollections.maintask.electricalAppliances.HomeCleaningAppliances;
import javacollections.maintask.specifications.EnergyConsumptionClass;
import javacollections.maintask.specifications.Execution;
import javacollections.maintask.specifications.NoiseLevel;
import javacollections.maintask.specifications.ScreenTechnology;

import java.util.Arrays;
import java.util.List;

public class AppliancesRunner {
    static List<Appliance> appliances = Arrays.asList(
            new ComputerEngineeringAppliances("Notebook MacBook Pro 16 MVVJ2", "Apple", 2, 45, ScreenTechnology.IPS),
            new ComputerEngineeringAppliances("TV QE55Q70TaU", "Samsung", 17, 200, ScreenTechnology.LCD),
            new CookingFoodAppliances("Refrigerator KIR81AF20R", "Bosch", 68, 116, EnergyConsumptionClass.A_PLUS, Execution.BUILD_IN),
            new CookingFoodAppliances("Oven HBJ14EBOR", "Bosch", 35, 3300, EnergyConsumptionClass.A, Execution.BUILD_IN),
            new HomeCleaningAppliances("Washing machine WLT2446SBL", "Bosch", 62, 2000, EnergyConsumptionClass.A_THREE_PLUS, NoiseLevel.MIDDLE),
            new HomeCleaningAppliances("Robot vacuum cleaner Roborock S6", "Xiaomi", 3, 58, EnergyConsumptionClass.A, NoiseLevel.QUIET),
            new HomeCleaningAppliances("Dishwasher EES948300L", "Electrolux", 29, 2100, EnergyConsumptionClass.A_THREE_PLUS, NoiseLevel.QUIET)
    );

    public static void main(String[] args) {
        HomeAppliances allAppliances = new HomeAppliances(appliances);
        HomeAppliances turningOnHomeAppliances = new HomeAppliances(allAppliances.turningOnAppliances());

        System.out.printf("The total power consumption for turned on appliances: %d\n",
                turningOnHomeAppliances.calculateTheTotalPowerConsumptionForTurnedOnAppliances());

        System.out.println("Appliances sorted by power consumption:\n" +
                allAppliances.sortByPowerConsumption().toString());

        System.out.println("Appliances that matches the specified range of parameters:\n" +
                allAppliances.findTheApplianceThatMatchesTheSpecifiedRangeOfParameters("Bosch", 3, 100));
    }
}
