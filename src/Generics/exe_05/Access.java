package Generics.exe_05;

import java.time.Instant;
import java.util.Objects;

public class Access {

    private String name;
    private Instant date;

    public Access(String name, Instant date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Access access)) return false;
        return Objects.equals(name, access.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
