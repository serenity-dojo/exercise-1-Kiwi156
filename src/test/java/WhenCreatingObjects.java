import com.serenitydojo.Cat;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        Cat felix = new Cat();

        felix.name = "Felix";
        felix.favoriteFood = "Tuna";
        felix.age = 4;

        Cat spot = new Cat();
        spot.name = "Spot";
        spot.age = 3;
        


    }
}
