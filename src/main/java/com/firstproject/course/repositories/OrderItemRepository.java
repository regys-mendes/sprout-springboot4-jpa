package com.firstproject.course.repositories;

import com.firstproject.course.entities.OrderItem;
import com.firstproject.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
