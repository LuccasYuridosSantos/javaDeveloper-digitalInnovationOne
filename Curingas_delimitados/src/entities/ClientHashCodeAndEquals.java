package entities;

import java.util.Objects;

public class ClientHashCodeAndEquals {

    private String name;
    private String email;

    public ClientHashCodeAndEquals () {
    }

    public ClientHashCodeAndEquals (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientHashCodeAndEquals)) return false;

        ClientHashCodeAndEquals that = (ClientHashCodeAndEquals) o;

        if (!getName().equals(that.getName())) return false;
        return getEmail().equals(that.getEmail());
    }

    @Override
    public int hashCode () {
        int result = getName().hashCode();
        result = 31 * result + getEmail().hashCode();
        return result;
    }
}
