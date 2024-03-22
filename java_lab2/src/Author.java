import java.util.Objects;

public class Author {
    public int name;
    public Author(int name) {
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
        return name == ((Author) obj).name;
    }
}
