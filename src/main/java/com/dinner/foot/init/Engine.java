package com.dinner.foot.init;

import com.dinner.foot.data.entities.*;
import com.dinner.foot.data.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Engine implements CommandLineRunner {

    @Autowired
    private final SupplementRepository supplementRepository;
    @Autowired
    private final CityRepository cityRepository;
    @Autowired
    private final FoodRepository foodRepository;
    @Autowired
    private final RoleRepository roleRepository;
    @Autowired
    private final UserRepository userRepository;

    public Engine(SupplementRepository supplementRepository, CityRepository cityRepository, FoodRepository foodRepository, RoleRepository roleRepository, UserRepository userRepository) {
        this.supplementRepository = supplementRepository;
        this.cityRepository = cityRepository;
        this.foodRepository = foodRepository;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {

//        Role role = new Role();
//        role.setAuthority("ADMIN");
//
//        if (roleRepository.count()== 0){
//            roleRepository.saveAndFlush(role);
//        }
//
//        City city = new City();
//        city.setName("Medovets");
//
//        if (cityRepository.count()==0){
//            cityRepository.saveAndFlush(city);
//        }
//
//        User user = new User();
//        user.setFirstName("Ali2");
//        user.setLastName("Zinal2");
//        user.setUsername("taurus3662");
//        user.setPassword("123452");
//        user.setPhoneNumber("1234567892");
//        user.setCity(cityRepository.findByName("Medovets"));
//        user.setRole(roleRepository.findByAuthority("ADMIN"));
//
//        if (userRepository.count() == 0){
//            userRepository.saveAndFlush(user);
//        }
//
//        Supplement supplement = new Supplement();
//        supplement.setName("ketchup");
//
//        if (supplementRepository.count() == 0){
//            supplementRepository.saveAndFlush(supplement);
//        }
//
//        Food food = new Food();
//        food.setName("hamburger");
//
//        if (foodRepository.count() == 0){
//            foodRepository.saveAndFlush(food);
//        }
//
//        User user = userRepository.findById(1).orElseThrow();
//        Food food = foodRepository.findById(1).orElseThrow();
//        Supplement supplement = supplementRepository.findById(1).orElseThrow();
//        food.setSupplements(List.of(supplement));
//        supplement.setFoods(List.of(food));
//        supplementRepository.saveAndFlush(supplement);
//        foodRepository.saveAndFlush(food);
       // user.setFoods(List.of(food));
       // userRepository.saveAndFlush(user);
        User user2 = userRepository.findById(2).orElseThrow();
        System.out.printf("name: %s > food: %s > supply: %s",user2.getFirstName(),user2.getFoods().size(),user2.getFoods().get(0).getSupplements().size());
    }
}
