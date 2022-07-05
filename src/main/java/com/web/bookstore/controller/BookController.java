package com.web.bookstore.controller;

import com.web.bookstore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class BookController {

    @GetMapping("/api/v1/book")
     public ResponseEntity<List<BookDto>> getBooks(){
        BookDto bookDto = BookDto.builder().title("my books").build();
        List<BookDto> bookDtos = new ArrayList<>();
        bookDtos.add(bookDto);
        return ResponseEntity.ok(bookDtos);
     }
}
