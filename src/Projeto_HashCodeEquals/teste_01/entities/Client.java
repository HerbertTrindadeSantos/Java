package Projeto_HashCodeEquals.teste_01.entities;

import java.util.Objects;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client product = (Client) o;
        return Objects.equals(name, product.name) && Objects.equals(email, product.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
