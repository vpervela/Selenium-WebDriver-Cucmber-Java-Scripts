package support;

public class FoodMain {
    public static void main(String[] args) {
        Protein whey = new Protein(140,50,"Powder");
        whey.eatFood();
        System.out.println(whey.getCalories());

        whey.setWeight(20);
        System.out.println(whey.getWeight());

        Carb c = new Carb(60,20,"Loaf");
        c.convertGlycogen();
    }
}
