package btvnbuoi1_qlthuvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Book> books = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static List<LoanRecord> loans = new ArrayList<>();

    public static void main(String[] args) {
        //them du lieu
        User user1 = new User("001", "Tien");
        User user2 = new User("002", "Linh");
        users.add(user1);
        users.add(user2);

        Book book1 = new Book("1", "lap trinh web", "ab");
        Book book2 = new Book("2", "ung dung AI", "abc");
        books.add(book1);
        books.add(book2);

        // muon sach
        borrowBook(user1, book1);
        borrowBook(user2, book2);

        // tra sach
        returnBook(user1, book1);

        // in ds muon
        System.out.println("\nsach dang duoc muon:");
        for (LoanRecord record : loans) {
            if (record.getReturnDate() == null) {
                System.out.println(record);
            }
        }

        // in ds tra ve
        System.out.println("\nsach da duoc tra:");
        for (LoanRecord record : loans) {
            if (record.getReturnDate() != null) {
                System.out.println(record);
            }
        }

        // lich su muon cua ng dung
        System.out.println("\nsach Tien da muon:");
        for (LoanRecord record : loans) {
            if (record.getUser().equals(user1)) {
                System.out.println(record);
            }
        }
    }

    public static void borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            loans.add(new LoanRecord(user, book, LocalDate.now()));
            System.out.println(user.getName() + " da muon: " + book.getTitle());
        } else {
            System.out.println("sach " + book.getTitle() + " ko co san.");
        }
    }

    public static void returnBook(User user, Book book) {
        for (LoanRecord record : loans) {
            if (record.getBook().equals(book) && record.getUser().equals(user) && record.getReturnDate() == null) {
                record.setReturnDate(LocalDate.now());
                book.setAvailable(true);
                System.out.println(user.getName() + " da tra: " + book.getTitle());
                return;
            }
        }
        System.out.println("ko tim thay ban ghi muon tuong ung.");
    }
}
