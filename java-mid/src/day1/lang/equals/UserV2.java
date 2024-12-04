package day1.lang.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        UserV2 userV2 = (UserV2) o;
        return userV2.id.equals(this.id);
    }

}
