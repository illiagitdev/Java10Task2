package lessons.lesson3.ifelse;

import lessons.lesson2.BinaryOperator;
import lessons.lesson2.LogicalOperator;
import lessons.lesson2.OperatorsExample;
import lessons.lesson2.VariablesExample;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть номер задачі:");
        System.out.println("0   -   BinaryOperator");
        System.out.println("1   -   VariableExample");
        System.out.println("2   -   LogicalOperators");
        System.out.println("3   -   operatorsExample");

        int taskNumber = scan.nextInt();

        if(taskNumber == 0){
            BinaryOperator.main(args);
        }
        if(taskNumber == 1){
            VariablesExample.main(args);
        }
        if(taskNumber == 2){
            LogicalOperator.main(args);
        }
        if(taskNumber == 3){
            OperatorsExample.main(args);
        }
    }
}
