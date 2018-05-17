

public class ArithmeticOperator {
    
    public int additonDifferentDataTypes(int a, short b){
        
        return a+b;
    }

    public int additonDifferentDataTypes(short a, int b) {
        return a+b;
    }


    public int multiplicationOfIntByShort(int a, short b) {
        return a*b;
    }

    public boolean booleanValueInvert(boolean b) {
        return !b;
    }

    public int preIncrement(int a){
        return ++a;
    }

    public int postIncrement(int a){
        int b=a++;
        return b;
    }

    public int preDecrement(int a){
        return --a;
    }
    public int postDecrement(int a){
        return a--;
    }

}
