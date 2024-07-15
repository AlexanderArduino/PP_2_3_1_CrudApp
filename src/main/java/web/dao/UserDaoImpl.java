package web.dao;


import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
//    private static final AtomicLong AUTO_ID = new AtomicLong();
//    private static Map<Long, User> users = new HashMap<>();
//    static{
//        User user1 = new User(AUTO_ID.getAndIncrement(), "Ivan", "Ivanov", 30, "IvanIvanov@mail.ru");
//        User user2 = new User(AUTO_ID.getAndIncrement(), "Petr", "Petrov", 19, "PetrPrtrov@mail.ru");
//        User user3 = new User(AUTO_ID.getAndIncrement(), "Nikolay", "Eremov", 43, "NikolayEremov@mail.ru");
//        User user4 = new User(AUTO_ID.getAndIncrement(), "Dima", "Kolchanov", 56, "DimaKolchanov@mail.ru");
//        User user5 = new User(AUTO_ID.getAndIncrement(), "Natalya", "Samburskaya", 28, "NatalyaSambursakya@mail.ru");
//        users.put(user1.getId(), user1);
//        users.put(user2.getId(), user2);
//        users.put(user3.getId(), user3);
//        users.put(user4.getId(), user4);
//        users.put(user5.getId(), user5);
//    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> allUsers() {
        List<User> usersList = new ArrayList<>();
        usersList = entityManager.createQuery("select u from User u", User.class).getResultList();
        return usersList;
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
