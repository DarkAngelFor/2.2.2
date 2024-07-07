package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

import java.util.Optional;

@Controller
public class CarController {
    private final CarDAO car;

    @Autowired
    public CarController(CarDAO car) {
        this.car = car;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("car", car.getCars(count.orElse(0)));
        return "cars";
    }

}
