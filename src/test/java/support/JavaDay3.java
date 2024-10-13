package support;

public class JavaDay3 {
    public static void main(String[] args){
        PancakeHouse cakes = new PancakeHouse("Samuel's first branch", 1100,9000);
        PancakeHouse cakes1 = new PancakeHouse("Marry's first branch", 1500,10000);
        cakes.makePancake(3);
        cakes1.makePancake(5);
        System.out.println(cakes.name);
    }
}
