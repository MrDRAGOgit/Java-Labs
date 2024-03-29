import java.util.Comparator;
import java.util.Objects;

public class Author implements Comparable<Author>{
    private String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return String.format("Name %s", name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(name, ((Author) obj).name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Author o) {
        return this.name.compareTo(o.getName());
    }
}
