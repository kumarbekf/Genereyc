public class Car <D>{
    private D id;
    private D name;

    public Car(D id, D name) {
        this.id = id;
        this.name = name;
    }

    public D getId() {
        return id;
    }

    public void setId(D id) {
        this.id = id;
    }

    public D getName() {
        return name;
    }

    public void setName(D name) {
        this.name = name;
    }
}
