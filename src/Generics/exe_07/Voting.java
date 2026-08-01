package Generics.exe_07;

import java.util.Objects;

public class Voting {

    private String name;
    private Integer qtdVote;

    public Voting(String name,Integer qtdVote){
        this.name = name;
        this.qtdVote = qtdVote;
    }

    public String getName(){
        return this.name;
    }

    public void SetName(String name){
        this.name = name;
    }

    public Integer getQtdVote() {
        return qtdVote;
    }

    public void setQtdVote(Integer qtdVote) {
        this.qtdVote = qtdVote;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Voting voting = (Voting) o;
        return Objects.equals(name, voting.name) && Objects.equals(qtdVote, voting.qtdVote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, qtdVote);
    }
}
