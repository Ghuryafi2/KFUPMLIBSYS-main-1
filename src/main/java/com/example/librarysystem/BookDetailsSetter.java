package com.example.librarysystem;

import Entities.PhysicalBook;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BookDetailsSetter {

    @FXML
    public Label title, ISBN, authors, publisher, volume, rackNumber, releaseDate, language;

    protected PhysicalBook book;

    protected void setBookDetails() {
        setBookTitle();
        setBookISBN();
        setBookAuthors();
        setBookPublisher();
        setBookVolume();
        setBookRackNumber();
        setBookReleaseDate();
        setBookLanguage();
    }

    protected void setBookTitle() {
        title.setText(book.getTitle());
    }

    protected void setBookISBN() {
        ISBN.setText(book.getISBN() + "");
    }

    protected void setBookAuthors() {
        authors.setText(book.getAuthors());
    }

    protected void setBookPublisher() {
        publisher.setText(book.getPublisherName());
    }

    protected void setBookVolume() {
        volume.setText(book.getVolume() + "");
    }

    protected void setBookRackNumber() {
        rackNumber.setText(book.getRackNum() + "");
    }

    protected void setBookReleaseDate() {
        releaseDate.setText(book.getReleaseDate());
    }

    protected void setBookLanguage() {
        language.setText(book.getLanguage());
    }
}
