package support;

public class MyLoopsHW {
    //create method to count mississippi word
    public static void countWord(int countNum){
        for(int i=1; i<= countNum; i++){
            System.out.println(i + " Mississippi");
        }
    }

    //create method to choose between 'foo' and 'bar'
    public static String fooOrBar(String word){
        if(word.equals("foo")){
            return "You chose foo! it's a Fun word";
        }
        else if(word.equals("bar")){
            return "You chose bar! Enjoy the party";
        }
        else{
            return "Invalid word.Please choose either 'foo' or 'bar'";
        }
    }
    //create method to print character name and message
    public static void myCharacter(){
        String charName = "Jerry";
        String message = "Jerry is known for being clever, cunning, and lucky";
        System.out.println(charName + ":" + message);
    }

    //call all  methods countNum,fooOrBar
    public static void main(String[] args){
        //call method with target countNum
        countWord(5);

        //call fooOrBar
        System.out.println(fooOrBar("foo"));
        System.out.println(fooOrBar("bar"));
        System.out.println(fooOrBar("bas"));

        //call myCharacter method
        myCharacter();
    }
}
