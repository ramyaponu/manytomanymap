package com.example.demo.repository2;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity2.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer>{

}
