package com.example.TranThiVIetAn_BtapKtra.Repositories;

import com.example.TranThiVIetAn_BtapKtra.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,String> {
}
