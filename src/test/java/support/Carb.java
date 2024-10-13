package support;

public class Carb extends Food{
    private int energy;

    public Carb(int cal,int weight,String state){
        setWeight(weight);
        super.calories = cal;
        super.state = state;
    }
    public void convertGlycogen(){
        energy = calories/20;
    }
}
