package TestProject.Stub;

public class ansverJson {

    public long id;

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String name;

    public String sity;

    @Override
    public String toString() {
        return "ansverJson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sity='" + sity + '\'' +
                '}';
    }
}
