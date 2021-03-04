package homework.task13;

import java.io.Serializable;
import java.util.*;

public class City implements Serializable {

    public static final long serialVersionUID = -1281698354240839372L;

    private final long id;
    private final String name;
    private final float longitude;
    private final float latitude;
    private final String countryCode;
    private final int population;

    public City(long id, String name, float longitude, float latitude, String code, int population) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.countryCode = code;
        this.population = population;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPopulation() {
        return population;
    }

    List<String> countyCodesWhereYouFindCity (Collection< City > cities) {
        List<String> countyCodesWhereYouFindCity = new ArrayList<>();
        for (City c : cities) {
            if (c.getCountryCode().contains(c.getCountryCode())) {
                countyCodesWhereYouFindCity.add(c.getCountryCode());
            }
            if (cities.size() == 100) break;
        }
        return countyCodesWhereYouFindCity;
    }

    List<City> polishCities(Collection<City> cities){
        List<City> result = new ArrayList<>();
        for (City c : cities) {
            if (c.getCountryCode().equals("PL")) {
                System.out.println(c);
                result.add(c);
            }
        }
        return result;
    }

    //NIEMIECKIE MIASTO O POPULACJI POWYŻEJ MILIONA USUNIĘT
    List<City> iteratorDelateGerman(Collection<City> cities) {
        List<City> c = new ArrayList<>();
        Iterator<City> iterator = cities.iterator();
        while (iterator.hasNext()) {
            City item = iterator.next();
            if (item.getPopulation() > 1_000_000 && item.getCountryCode().equals("DE")) {
                c.add(item);
                System.out.println(item.getName() + " miato zostało usunięte");
                iterator.remove();
            }
        }
        return c;
    }

    //USUWANIE MIASTA O POPULACJI WIEKSZEJ OD 10_000
    List<City> iteratorDelate(Collection<City> cities) {
        List<City> c = new ArrayList<>();
        Iterator<City> iterator = cities.iterator();
        while (iterator.hasNext()) {
            City item = iterator.next();
            if (item.getPopulation() < 10_000) {
                c.add(item);
            }
            if (item.getPopulation() < 10_000) {
                System.out.println(item.getName() + " miato zostało usunięte");
                iterator.remove();
            }
        }
        return c;
    }

    //DODANIE DODATKOWEGO MIASTA TYPU ZMIANA NAZWY Z "NOWA" NA "STARA"
    List<City> itereatorAddWithNewName(Collection<City> cities) throws CloneNotSupportedException {
        List<City> c = new ArrayList<>();
        ListIterator<City> iterator = (ListIterator<City>) cities.iterator();
        while(iterator.hasNext()){
            City item = iterator.next();
            if (item.getCountryCode().equals("PL") && item.getName().equals("Nowa")){
                c.add(item);
                item.clone().toString().replace("Nowa","Stara");
                c.add(item);
            }
        }
        return c;
    }



    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", code='" + countryCode + '\'' +
                ", population=" + population +
                '}';
    }
}
