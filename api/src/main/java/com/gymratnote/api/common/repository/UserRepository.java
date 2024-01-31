package com.gymratnote.api.common.repository;

import com.gymratnote.api.common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 필요한 추가적인 메서드를 여기에 정의할 수 있습니다.
}
