import org.junit.Test;


public class WhenDealingWithNumbers {


    @Test
    public void  floatPointNumbers(){
        Integer i = 10000;
        long l = 10000000000000L;

        float f = 3.4159F;
        double d = 3.141594395775;

        System.out.println("FLOAT: " + f);
        System.out.println("DOUBLE " + d);
        }

      @Test
      public void minsAndMaxes(){
        int youngest = Math.min(30, 60);
        int oldest = Math.max(30, 60);



      }

    }

