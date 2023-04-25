package io.github.chw3021.bookmakase.journal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.chw3021.bookmakase.bookdata.dto.Book;
import io.github.chw3021.bookmakase.journal.domain.Journal;
import io.github.chw3021.bookmakase.signservice.domain.Member;

public interface JournalRepository extends JpaRepository<Journal, Long> {

    List<Journal> findByMemberOrderByDateDesc(Member member);
    List<Journal> findByBookOrderByDateDesc(Book book);
    List<Journal> findByDateDesc(LocalDate startDate);
}