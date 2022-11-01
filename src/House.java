
public class House {
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public House(Person owner) {
        this.owner = owner;
    }
}
