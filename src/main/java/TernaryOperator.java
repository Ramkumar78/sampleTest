public class TernaryOperator {

    public boolean evaluateExpression(String user){

        boolean operate = false;
        if(user=="unwell"){

            operate=true;
        }

        else{operate=false;}

        return operate;
    }

    public String expressionIfUnwell(){
        return "Admit him into the hospital";
    }


    public String expressionIfAlright(){
        return "Examine and Discharge";
    }


}
