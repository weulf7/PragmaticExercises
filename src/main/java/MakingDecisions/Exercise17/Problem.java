package MakingDecisions.Exercise17;

public class Problem {

    double alcoholConsumed;
    double bodyWeightPounds;
    double alcoholRatio;
    double hoursSinceDrink;



    public void start(){



    }

    public  void bloodAlcoholCalculator(double alcoholConsumed,double bodyWeightPounds,double alcoholRatio,double hoursSinceDrink){
        double bAc=((alcoholConsumed*5.14)/bodyWeightPounds*alcoholRatio)-(.015*hoursSinceDrink);

        if (bAc>=0.08){
            System.out.println("Your BAC is "+bAc);
            System.out.println("It is not legal for you to drive.");




     }
        else {
            System.out.println("It is legal to drive.");
        }
    }


}

