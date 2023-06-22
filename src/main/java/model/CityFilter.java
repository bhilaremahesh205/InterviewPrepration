package model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CityFilter {
    public static void main(String[] args) {
       /* var p1 = new City("pune", "Maharashtra", "INDIA");
        var p2 = new City("mumbai", "Maharashtra", "INDIA");
        var p3 = new City("satara", "Maharashtra", "INDIA");


        Predicate<City> cityName = city -> Boolean.parseBoolean(city.getName());

        var result = city.stream().filter(byAge)
                .collect(Collectors.toList());

        System.out.println(result);*/

  //      List<String> cityNames = Arrays.asList("pune", "mumbai", "goa", "delhi");
        //List<String> names = Arrays.asList("pune", "mumbai", "goa", "delhi");
       /// List<City> cityList = cityNames.stream().filter(x -> cityNames)



   //     List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,13,14,42,111,22,33,44,1,23,4,5,6,7,8,8,9,22,11);
        //integerList.stream().filter(x->x%2==0).forEach(System.out::println);
        //integerList.stream().filter(x->x%2 !=0).forEach(System.out::println);
        //integerList.stream().map(x-> x * 2).filter(y->y %2 == 0).forEach(System.out::println);
        //integerList.stream().distinct().forEach(System.out::println);
      //  integerList.stream().sorted().forEach(System.out::println);

        List<City> cities = Arrays.asList(new City("pune","maharashtra","INDIA"),
        new City("pune","maharashtra","INDIA"),
        new City("mumbai","maharashtra","INDIA"),
        new City("satara","maharashtra","INDIA"),
        new City("kolhapur","maharashtra","INDIA"),
        new City("solapur","maharashtra","INDIA"));

       // Map<String,List<City>> maps = cities.stream().filter(x->x.getName().startsWith("P")).forEach(System.out::println);
       // Map<String,List<City>> maps =  cities.stream().filter(x->x.getName().startsWith("P"));
      //  System.out.println(maps);

       // Map<String,List<City>> maps =  cities.stream().collect(Collectors.groupingBy(name-> name.getName()));
      //  Map<String,List<City>> maps =  cities.stream().collect(Collectors.groupingBy(x->x.getName().startsWith("p")));
       // System.out.println(maps);


    }
}
