package com.nb.library.repository.impl.data;

import com.nb.library.entity.user.UserAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserAccount, Integer> {
    Optional<UserAccount> findByEmail(String email);
}
