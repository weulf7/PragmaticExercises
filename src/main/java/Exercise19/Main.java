package Exercise19;

public class Main {
    public static void main(String[]args){
        bmiCalculator(165,68.98);

    }

    public static void bmiCalculator(double weight,double height){
        double bmi=(weight/(height*height))*703;

        if (bmi>=18.5 && bmi <=25){
            System.out.println("Your BMI is "  + bmi + "."+'\n'
                    +"You are within the ideal weight range");
        }
        else if(bmi >25){
            System.out.println("Your BMI is "+bmi+"."+'\n'
                    +"You are overweight.You should see your doctor.");
        }
        else {
            System.out.println("Something went wrong!!Try again");
        }




    }
}
