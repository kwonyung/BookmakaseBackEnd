package io.github.chw3021.bookmakase.bookdata.domain;

import java.time.LocalDate;

//import io.github.chw3021.bookmakase.goal.domain.BookShelf;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor @Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private int categoryId;
    private String publisher;
    private LocalDate pubDate;
    private String cover;
    private String description;
    private String link;

    @Column (name = "book_id")
    private Long bookId;
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getCategoryId() {
    	return categoryId;
    }
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	

    private String[] keywords;//크롤링후 검색결과 저장
    public String[] getKeywords() {
    	return keywords;
    }
	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	

	//독서 목표
   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookshelf_id")
    private BookShelf bookShelf;

    public BookShelf getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }*/
}