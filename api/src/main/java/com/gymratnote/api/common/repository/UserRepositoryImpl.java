package com.gymratnote.api.common.repository;
import com.gymratnote.api.common.model.User;
import com.gymratnote.api.common.model.QUser;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.core.types.dsl.BooleanExpression;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.ArrayList;

@RequiredArgsConstructor
public class UserRepositoryImpl implements CustomUserRepository {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<User> findCustomQuery(String name) {
        QUser qUser = QUser.user;

        return queryFactory.selectFrom(qUser)
                           .where(qUser.username.eq(name))
                           .fetch();
    }
    
    @Override
    public List<User> findUsersWithPredicate(String name, String accounttype) {
        QUser qUser = QUser.user;
        List<BooleanExpression> conditions = new ArrayList<>();
    
        if (name != null) {
            conditions.add(qUser.username.eq(name));
        }
        if (accounttype != null) {
            conditions.add(qUser.accountType.eq(accounttype));
        }
    
        BooleanExpression combined = conditions.stream()
                                               .reduce(BooleanExpression::and)
                                               .orElse(null);
    
        return queryFactory.selectFrom(qUser)
                           .where(combined)
                           .fetch();
    }
}
