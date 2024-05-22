package com.example.popitka.controller;



import com.example.popitka.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class BuyerController {
    @GetMapping("/get_all_userss")
    public List<User> getAllBuyers() {
        List <User> buyer = new ArrayList<>();
        User buyer1 = new User(1, "Myhtar", 73);
        User buyer2 = new User(2, "Jeckson Semenovich", 25);
        buyer.add(buyer1);
        buyer.add(buyer2);
        return buyer;
    }
}
