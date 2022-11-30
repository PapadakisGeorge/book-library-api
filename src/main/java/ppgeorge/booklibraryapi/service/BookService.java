package ppgeorge.booklibraryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ppgeorge.booklibraryapi.exceptions.BookNotFoundException;
import ppgeorge.booklibraryapi.model.Book;
import ppgeorge.booklibraryapi.repository.BookRepository;

import java.util.List;

@Service
public record BookService(BookRepository bookRepository) {
    @Autowired
    public BookService {
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book by id " + id + " was not found."));
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteBookById(id);
    }
}
