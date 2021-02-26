package homework.task13;

import java.util.List;

public class CityPaginator {
    List<City>cities;
    final String page;

    public CityPaginator(List<City> cities, String pageSize) {
        this.cities = cities;
        this.page = pageSize;
    }

    public List<City> current(){
        return cities.subList(0,19);
    }

    public List<City> next(){
        return ;

    }
}
