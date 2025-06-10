 package simple;
 public class simpleinterest{
    public static double simpleinterest(double principle,double rate,double time){
        return principle*rate*time/100;
    }
    public static void main(String[]args){
        double principle=10000,rate=5.5,time=2;
        double interest=simpleinterest(principle,rate,time);
        System.out.println("SimpleInterest:"+interest);
        }
    }
