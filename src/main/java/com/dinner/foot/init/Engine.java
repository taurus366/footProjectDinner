package com.dinner.foot.init;

import com.dinner.foot.data.entities.Food;
import com.dinner.foot.data.entities.Order;
import com.dinner.foot.data.entities.Supplement;
import com.dinner.foot.data.entities.User;
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
    @Autowired
    private final OrderRepository orderRepository;

    public Engine(SupplementRepository supplementRepository, CityRepository cityRepository, FoodRepository foodRepository, RoleRepository roleRepository, UserRepository userRepository, OrderRepository orderRepository) {
        this.supplementRepository = supplementRepository;
        this.cityRepository = cityRepository;
        this.foodRepository = foodRepository;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
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
//        User user2 = userRepository.findById(2).orElseThrow();
//        System.out.printf("name: %s > food: %s > supply: %s",user2.getFirstName(),user2.getFoods().size(),user2.getFoods().get(0).getSupplements().size());

//        User user = userRepository.getOne(1);
//        Food food = foodRepository.getOne(1);
//        Supplement supplement1 = supplementRepository.getOne(1);
//        Supplement supplement2 = supplementRepository.getOne(2);
//
//        Order order = new Order();
//        order.setUser(user);
//        order.setFood(food);
//        order.setSupplement(List.of(supplement1));
//        orderRepository.saveAndFlush(order);
//
//        User user2 = userRepository.getOne(2);
//
//        Order order2 = new Order();
//        order2.setUser(user2);
//        order2.setFood(food);
//        order2.setSupplement(List.of(supplement1,supplement2));
//        orderRepository.saveAndFlush(order2);
        User user1 = userRepository.getOne(1);
        User user2 = userRepository.getOne(2);

//        System.out.printf("user: %s > food: %s > supplement: %d",user1.getFirstName(),user1.getOrders().get(0).getFood().getName(),user1.getOrders().get(0).getSupplement().size());
//        System.out.println("------");
//        System.out.printf("user: %s > food: %s > supplement: %d",user1.getFirstName(),user2.getOrders().get(0).getFood().getName(),user2.getOrders().get(0).getSupplement().size());
//       List<Order> order = orderRepository.findAll();
//       order.forEach(u -> {
//           System.out.println("name: "+u.getUser().getFirstName());
//           System.out.println(u.getFood().getName());
//           System.out.println("size " + u.getSupplement().size());
//       });

        List<Order> order1 = orderRepository.findAllByUser(user1);
        System.out.println(order1.size());
//        order1.forEach(order ->{
////            System.out.println(order.getUser().getFirstName());
////            System.out.println(order.getFood().getName());
////            System.out.println(order.getSupplement().size());
////            order.getSupplement().forEach(supplement -> {
////                System.out.println(supplement.getName());
////            });
////            System.out.println("----------------------");
//            System.out.println(order.getUser().getOrders().get(0).getFood().getName());
//        });
    }
}
