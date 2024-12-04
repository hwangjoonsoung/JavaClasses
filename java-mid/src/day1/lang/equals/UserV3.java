package day1.lang.equals;

import java.util.Objects;

public class UserV3 {
    private Long id;
    private String name;

    public UserV3(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV3 userV3 = (UserV3) o;
        return Objects.equals(id, userV3.id) && Objects.equals(name, userV3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
