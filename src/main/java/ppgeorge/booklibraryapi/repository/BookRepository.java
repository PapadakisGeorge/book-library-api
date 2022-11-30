package ppgeorge.booklibraryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ppgeorge.booklibraryapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional
    void deleteBookById(Long id);
}
