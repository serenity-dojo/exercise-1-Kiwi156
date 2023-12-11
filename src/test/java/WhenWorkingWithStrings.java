import org.junit.Test;

public class WhenWorkingWithStrings {
    @Test
    public void ConvertingToLowerCase() {

    String CityName = "Auckland";

    String lowerCaseCityName = CityName.toLowerCase();

        System.out.println(lowerCaseCityName);
   }

   @Test
   public void ConvertingToUpperCase(){

   String CityName = "Wellington";

   String upperCaseCityName = CityName.toUpperCase();

       System.out.println(upperCaseCityName);
   }
   @Test
   public void trimExtraSpace(){

   String MessieCityName = "  Christchurch";

   String CleanCityName = MessieCityName.trim();

       System.out.println(CleanCityName);
   }
   @Test
   public void findTheLengthOfAString(){

   String PlaceWithAlongName = "Taumatawhaktangihangakoauaotamateaturipukakapikimaungahoronukupokaiwhenakitantahu";

   String lengthOfName = PlaceWithAlongName;

       System.out.println(lengthOfName.length());
   }
   @Test
   public void replacingTextInAString(){

   String PlaceName = "WhiteValley";

   String NewName = PlaceName;

       System.out.println(NewName.replace("W", "S"));
    }
    @Test
    public void havingaplaywithstrings(){

    String blarblar = "shut_up!";

        String upperCaseblarblar = blarblar.toUpperCase();

        System.out.println(upperCaseblarblar);

    }
    @Test
    public void havingmoreplaywithstrings(){

        String blarblar = "shut_up!";

        String lowerCaseCaseblarblar = blarblar.toLowerCase();

        System.out.println(lowerCaseCaseblarblar);

    }




}