package com.vedroid.server.service;

import com.vedroid.server.exception.ShopNotFound;
import com.vedroid.server.model.Shop;

import java.util.List;

public interface ShopService {

    Shop create(Shop shop);

    Shop delete(int id) throws ShopNotFound;

    List<Shop> findAll();

    Shop update(Shop shop) throws ShopNotFound;

    Shop findById(int id);

}
