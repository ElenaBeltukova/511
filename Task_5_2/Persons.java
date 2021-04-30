import java.util.UUID;

public class Persons {
    public String surname;
    public String city;
    private UUID uuid;

    public Persons(String surname, String city) {
        this.surname = surname;
        this.city = city;
        this.uuid = UUID.randomUUID();
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

}
