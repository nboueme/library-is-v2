package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.user.UserAccount;
import com.nb.library.repository.contract.UserDaoContract;
import com.nb.library.repository.impl.data.UserRepository;
import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

public class HibernateUser implements UserDaoContract {

    @Resource
    private UserRepository userRepository;

    @Transactional
    public UserAccount login(UserAccount user) {
        /*String query = "select u from user_account u where u.email = :user_email";
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        UserAccount existingUser = entityManager.createQuery(query, UserAccount.class)
                .setParameter("user_email", user.getEmail())
                .getSingleResult();*/

        Optional<UserAccount> existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser.isPresent()) {
            if (BCrypt.checkpw(user.getPassword(), existingUser.get().getPassword())
                    && existingUser.get().getRole().equals("user")) {
                System.out.println("Correct login credentials");
                return existingUser.get();
            }
            else {
                System.out.println("Incorrect login credentials");
                return null;
            }
        } else {
            System.out.println("Incorrect login credentials");
            return null;
        }
    }
}
