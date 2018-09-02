package DataTypesAndLoops;

import org.junit.Test;

public class InterfaceImpleExample {
    public void cutCheck(Payable p) {
        double updatedSalary = p.raiseSalary(10);
        printSalary(updatedSalary);
    }

    public void printSalary(double salary) {
        System.out.println(salary);
    }

    public void salaryCalc() {

        /*(String a, String b, String c) -> {
            return a + b + c;
        };*/

    }
}
