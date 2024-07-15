package web.dao;


import web.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class UserDaoImpl implements UserDao{
    private static final AtomicLong AUTO_ID = new AtomicLong();
    private static Map<Long, User> users = new HashMap<>();
    static{
        User user1 = new User(AUTO_ID.getAndIncrement(), "Ivan", "Ivanov", 30, "IvanIvanov@mail.ru");
        User user2 = new User(AUTO_ID.getAndIncrement(), "Petr", "Petrov", 19, "PetrPrtrov@mail.ru");
        User user3 = new User(AUTO_ID.getAndIncrement(), "Nikolay", "Eremov", 43, "NikolayEremov@mail.ru");
        User user4 = new User(AUTO_ID.getAndIncrement(), "Dima", "Kolchanov", 56, "DimaKolchanov@mail.ru");
        User user5 = new User(AUTO_ID.getAndIncrement(), "Natalya", "Samburskaya", 28, "NatalyaSambursakya@mail.ru");
    }

    @Override
    public List<User> allUsers() {
        return List.of();
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void edit(User user) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }
}
