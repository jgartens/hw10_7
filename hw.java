/**
 * hw 10_7 Jacob Gartenstein
 */

import java.util.Scanner;


public class hw {

    public static void main(String[] args) {
        //Part 1: 2.
        Scanner input = new Scanner(System.in);
        // System.out.print("Please enter you test score:\n");
        // double myNumGrade = input.nextDouble();
        // System.out.printf("Your letter grade is: %s\n", getLetterGradeSwitch(myNumGrade));

        
        int cat = 4;
        calculateStormThreat(cat, input);
    }

    

    //Part 1: 1.
    public static char getLetterGrade(double numGrade){
        if (numGrade >= 90){
            return 'A';
        }
        else if (numGrade >= 80){
            return 'B';
        }
        else if (numGrade >= 70){
            return 'C';
        }
        else if (numGrade >= 60){
            return 'D';
        }
        else {
            return 'F';
        }
    }

    //part 2: 1.
    public static char getLetterGradeSwitch(double numGrade){
        switch ((int)numGrade){

            case 100:
            case 99:
            case 98:
            case 97:
            case 96: case 95: case 94: case 93: case 92: case 91: case 90:
                return 'A';
            case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
                return 'B';
            case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
                return 'C';
            case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
                return 'D';
            default: 
                return 'F';
        }
    }
    //part 2: 2.
    /*
    Programmers would prefer switch over if-else because it allows for multiple
    conditions in one statement.  In if-else statements, only one condition (or combination of conditions),
    is allowed.  In this case, however, the switch statement isn't the most efficient becasue 
    we're analyzing numbers within an acceptable range.  Also, I was originally using a double, 
    which isn't compatible with Swtich statements.
    */

    //Part 3: 1.
    public static void calculateStormThreat(int cat, Scanner input){
        System.out.print("Is the storm a Watch or Warning for your area?\n");
        String type = input.nextLine();
        System.out.print("Do you live in a coastal area (true or false)?\n");
        Boolean coastal = input.nextBoolean();
        String dangerlevel;
        dangerlevel = "None";

        switch(cat){
            case 1:
                if (coastal){
                    if(type.equals("Watch")){
                        dangerlevel = "Low";
                    }
                    else{
                        dangerlevel = "Moderate";
                    }
                }
                else{
                    if(type.equals("Watch")){
                        dangerlevel = "Very Low";
                    }
                    else{
                        dangerlevel = "Low";
                    }
                } 
                break;
            case 2: 
                if (coastal){
                    if(type.equals("Watch")){
                        dangerlevel = "Moderate";
                    }
                    else{
                        dangerlevel = "Dangerous";
                    }
                }
                else{
                    if(type.equals("Watch")){
                        dangerlevel = "Low";
                    }
                    else{
                        dangerlevel = "Moderate";
                    }
                }
                break; 
            case 3:
                if (coastal){
                    if(type.equals("Watch")){
                        dangerlevel = "Dangerous";
                    }
                    else{
                        dangerlevel = "Very Dangerous";
                    }
                }
                else{
                    if(type.equals("Watch")){
                        dangerlevel = "Moderate";
                    }
                    else{
                        dangerlevel = "Dangerous";
                    }
                }
                break;
            case 4: case 5:
                if (coastal){
                    if(type.equals("Watch")){
                        dangerlevel = " Very Dangerous";
                    }
                    else{
                        dangerlevel = "Evacuate Immediately!!";
                    }
                }
                else{
                    if(type.equals("Watch")){
                        dangerlevel = "Dangerous";
                    }
                    else{
                        dangerlevel = "Very Dangerous";
                    }
                }
                break;
            }

        System.out.printf("The upcoming storm is considered: %s\n Take appropriate action.\n", dangerlevel);
    }
    
}