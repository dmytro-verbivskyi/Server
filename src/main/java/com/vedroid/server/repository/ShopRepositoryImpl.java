package com.vedroid.server.repository;

import com.vedroid.server.dao.ShopDAO;
import com.vedroid.server.exception.ShopNotFound;
import com.vedroid.server.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ShopRepositoryImpl implements ShopRepository {

    @Autowired
    private ShopDAO shopDAO;

    @Override
    @Transactional
    public Shop create(Shop shop) {
        return shopDAO.save(shop);
    }

    @Override
    @Transactional
    public void delete(Long id) throws ShopNotFound {
        shopDAO.delete(id);
    }

    @Override
    @Transactional
    public List<Shop> findAll() {
        return shopDAO.findAll();
    }

    @Override
    @Transactional
    public Shop update(Shop shop) throws ShopNotFound {
        return shopDAO.saveAndFlush(shop);
    }

    @Override
    @Transactional
    public Shop findById(Long id) {
        return shopDAO.findOne(id);
    }

}
