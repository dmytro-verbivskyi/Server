package com.vedroid.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedroid.server.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
