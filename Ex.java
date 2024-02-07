class Main_class{
    private int m1,m2;
    public Main_class(){

    }
    public Main_class(int mark1,int mark2){
        this.m1=mark1;
        this.m2=mark2;
    }

    public void calAvg(){
        System.out.println((this.m1+this.m2)/2);
    }

    public static void main_method(){
            System.out.println("This is main method");
    }
    public  double computePayment( double loanAmt, double rate, double futureValue, int  numPeriods) { 
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest), - numPeriods); 
        double denominator = (1 - partial1) / interest; 	
        double answer = (-loanAmt / denominator) - ((futureValue 	* partial1) / denominator); return answer;
     }    
}
class Ex{
    public static void main(String[] args) {
        
        Main_class m1=new Main_class();
        double ans;
        ans=m1.computePayment(100000.00, 0.13, 50000.00, 36);
        System.out.println("Installment is"+ans);

        m1.calAvg();
        
        Main_class m2=new Main_class(98,75);
        m2.calAvg();
    }
}