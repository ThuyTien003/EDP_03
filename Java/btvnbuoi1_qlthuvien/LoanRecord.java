package btvnbuoi1_qlthuvien;

import java.time.LocalDate;

public class LoanRecord {
    private User user;
    private Book book;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public LoanRecord(User user, Book book, LocalDate loanDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = null;
    }

    public User getUser() { return user; }
    public Book getBook() { return book; }
    public LocalDate getLoanDate() { return loanDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

    @Override
    public String toString() {
        return user.getName() + " borrowed \"" + book.getTitle() + "\" on " + loanDate +
                (returnDate != null ? ", returned on " + returnDate : ", not returned yet");
    }
}
