package homework.task13;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CityPaginator {
    List<City>cities;
    int page;

    public CityPaginator(List<City> cities, int page) {
        this.cities = cities;
        this.page = page;
    }

    public CityPaginator() {
    }

    public List<City> current(List<City> cities){
        System.out.println();
        return cities.subList(1,20);
    }

    public Iterator<City> next(List<City> cities){
        return cities.listIterator(20);
    }
    public Iterator<City> previous(List<City> cities){
        return current(cities).listIterator(-20);
    }
    public Iterator<City> reset(List<City> cities){
        return cities.listIterator(0);
    }
    public Iterator<City> skip(List<City> cities){
        return cities.listIterator(page);
    }
}