import components.naturalnumber.NaturalNumberKernel;
import components.list.*;
import components.set.*;
import components.map.*;

public interface FoodRisk extends FoodRiskKernel{

    // Secondary Methods


    /*
     *
     */
    void calculateIngredientRisk(String ingredient);

    /*
     *
     */
    void calculateProductRisk(String product);

    /*
     *
     */
    List<String> getHighRiskIngredients(Set<String> ingredients, double riskThreshold);

    /*
     *
     */
    List<String> getHighRiskProducts(Set<String> products, double riskThreshold);

    /*
     *
     */
    Map<String, Double> getHighestIngredientRisks(Set<String> ingredients);

    /*
     *
     */
    Map<String, Double> getHighestProductRisks(Set<String> products);



}
