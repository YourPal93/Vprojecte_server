package com.friend.your.vprojecte.dao;

import com.friend.your.vprojecte.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
