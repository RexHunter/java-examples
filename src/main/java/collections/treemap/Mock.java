package collections.treemap;

public class Mock implements Comparable<Mock> {
    public Integer id;
    private String name;

    public Mock(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Mock o) {
        Integer idComparison = this.id.compareTo(o.getId());
        return (idComparison == 0) ? this.name.compareTo(o.getName()) : idComparison;
    }

    @Override
    public String toString() {
        return "Mock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
