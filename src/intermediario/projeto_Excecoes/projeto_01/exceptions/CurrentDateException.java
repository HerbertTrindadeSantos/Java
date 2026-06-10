package intermediario.projeto_Excecoes.projeto_01.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateException extends Exception {
    private final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final LocalDate invalidDate;

    public CurrentDateException(LocalDate date, LocalDate dateNow) {
        super("A data "+date.format(fmt)+" não pode ser inferior a  data atual "+dateNow.format(fmt));
        this.invalidDate = date;
    }

    public LocalDate getInvalidDate(){
        return invalidDate;
    }
}
