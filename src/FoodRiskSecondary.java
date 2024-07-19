import components.list.*;
import components.map.*;
import components.set.*;

public abstract class FoodRiskSecondary implements FoodRisk {

    // Implement using kernel methods only

    @Override
    public void calculateIngredientRisk(String ingredient) {

    }

    @Override
    public void calculateProductRisk(String product) {

    }

    @Override
    public List<String> getHighRiskIngredients(Set<String> ingredients, double riskThreshold) {

    }

    @Override
    public List<String> getHighRiskProducts(Set<String> products, double riskThreshold) {

    }

    @Override
    public Map<String, Double> getHighestIngredientRisks(Set<String> ingredients) {

    }

    @Override
    public Map<String, Double> getHighestProductRisks(Set<String> products) {

}
}
