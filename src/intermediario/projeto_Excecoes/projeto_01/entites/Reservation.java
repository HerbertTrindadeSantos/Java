package intermediario.projeto_Excecoes.projeto_01.entites;

import intermediario.projeto_Excecoes.projeto_01.exceptions.CurrentDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws CurrentDateException {
        validateDate(checkIn);
        validateDate(checkOut);
        validateRange(checkIn, checkOut);
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private void validateDate(LocalDate date) throws CurrentDateException {
        LocalDate dateToday = LocalDate.now();
        if (date == null) {
            throw new IllegalArgumentException("Data nao pode ser nula");
        }
        if (date.isBefore(dateToday)) {
            throw new CurrentDateException(date, dateToday);
        }
    }

    private void validateRange(LocalDate checkIn, LocalDate checkOut) {
        if (checkOut.isBefore(checkIn)) {
            throw new IllegalArgumentException(" A data de ChekOut " + checkOut.format(fmt) + " nao pode ser antes da data de CheckIn " + checkIn.format(fmt));
        }
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public long duration() {
        long qtdDays = ChronoUnit.DAYS.between(checkIn, checkOut);
        return qtdDays;
    }

    @Override
    public String toString() {
        return "Reserva:\nQuarto "
                + this.roomNumber
                + "\n-Check-In:"
                + this.checkIn.format(fmt)
                + "\n-Check-Out:" + this.checkOut.format(fmt)
                + "\n-"
                + duration()
                + " noite(s)";
    }
}
