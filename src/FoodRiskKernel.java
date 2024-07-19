import components.map.*;

public interface FoodRiskKernel {

// Getters

    /**
    *
    */
    String getIngredient();

    /**
     *
     */
    Map<String, Double> getIngredientRiskData(String ingredient);

    /**
     *
     */
    Map<String, Double> getProductRiskData(String product);

// Setters

    /**
     *
     */
    void setIngredientRiskData(String ingredient, Map<String, Double> riskData);

    /*
     *
     */
    void setProductRiskData(String product, Map<String, Map<String,Double>> ingredientRiskData);
}
