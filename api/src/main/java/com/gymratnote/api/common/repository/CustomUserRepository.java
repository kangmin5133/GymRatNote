package com.gymratnote.api.common.repository;
import com.gymratnote.api.common.model.User;
import java.util.List;

public interface CustomUserRepository {
    List<User> findCustomQuery(String name);
    List<User> findUsersWithPredicate(String name, String accounttype);
}