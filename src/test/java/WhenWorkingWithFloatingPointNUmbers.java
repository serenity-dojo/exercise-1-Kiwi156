import org.junit.Test;

public class WhenWorkingWithFloatingPointNUmbers {
    @Test
    public void convertCelsiusToFahrenheit(){
            double temperatureCelsius = 1000;
            double temperatureAsFahrenheit = ((temperatureCelsius * 1.8) + 32);

            System.out.println(temperatureAsFahrenheit);

    }

}
