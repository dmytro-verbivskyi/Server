package com.vedroid.server.repository;

import com.vedroid.server.exception.ShopNotFound;
import com.vedroid.server.model.Shop;

import java.util.List;

public interface IShopRepository {

    Shop create(Shop shop);

    void delete(Long id) throws ShopNotFound;

    List<Shop> findAll();

    Shop update(Shop shop) throws ShopNotFound;

    Shop findById(Long id);
}
