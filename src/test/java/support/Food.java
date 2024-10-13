package support;

import org.apache.logging.log4j.core.appender.ConsoleAppender;

public abstract class Food {
    protected int calories;
    private int weight;
    public String state;
    public int energy;

    public void eatFood(){
        System.out.println("Consume food");

    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
}
