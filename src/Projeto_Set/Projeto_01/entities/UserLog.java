package Projeto_Set.Projeto_01.entities;

import java.time.Instant;
import java.util.Objects;

public class UserLog implements Comparable<UserLog> {
    private String username;
    private Instant moment;

    public UserLog(String username, Instant moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserLog userLog = (UserLog) o;
        return Objects.equals(username, userLog.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public int compareTo(UserLog userLog) {
        return getUsername().compareTo(userLog.getUsername());
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "username='" + username + '\'' +
                ", moment=" + moment +
                '}';
    }
}
