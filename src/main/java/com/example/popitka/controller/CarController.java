package com.example.popitka.controller;
import com.example.zachet_adminka.model.Book;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/books")
public class CarController {
    @GetMapping("/get_all_books")
    public List<Book> getAllCars() {
        List<Book> cars = new ArrayList<>();
        Book car1 = new Book(1, "Myhtar", "Comedy Club");
        Book car2 = new Book(2, "Sobaka","Fantazy");
        cars.add(car1);
        cars.add(car2);
        return cars;
    }

}
