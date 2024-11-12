package homework_44.tourist;

import java.util.List;

public class Tourist {

    private String Name;
    private List<String> country;

    public Tourist(String name, List<String> country) {
        Name = name;
        this.country = country;
    }

    public String getName() {
        return Name;
    }

    public List<String> getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Tourist: " + Name + " , country: " + country.toString();
    }
}
