package support;

public class Protein extends Food {

    public Protein(int cal,int wgt,String state){
        //use setters  to create protein object
        setWeight(wgt);
        super.state = state;
        super.calories = cal;
    }

    //override the inherited method
    @Override
    public void eatFood(){
        System.out.println("Get Weighttttt");
    }

}
