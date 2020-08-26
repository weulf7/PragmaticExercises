package Repetition;

public class Exercise30 {
    public static void main(String[] args) {
multiplicationTable();
    }

    private static void multiplicationTable(){
        int total=0;
        int total1=0;
        int multiple;
        for (int i=0;i<=12;i++){
            total=+i;


            for (int j=0;j<=12;j++){
                total1=+j;
                multiple=total*total1;
                System.out.println(total+"*"+total1+"="+(total*total1));

            }
        }


    }

}
