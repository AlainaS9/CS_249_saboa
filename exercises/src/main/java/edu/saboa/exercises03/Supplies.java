package edu.saboa.exercises03;

public class Supplies {
    //get # of people, food per day, and total food
    double totalFood;

    public double addFood(double foodInc){
        if (foodInc >= 0){
            totalFood += foodInc;
            return foodInc;
        }

        return 0;
    }
public double removeFood(double foodDec){
        if (foodDec >= 0) {
            foodDec = Math.min(totalFood, foodDec);
            totalFood -= foodDec;
            return foodDec;
        }
        return 0;
        }


}
