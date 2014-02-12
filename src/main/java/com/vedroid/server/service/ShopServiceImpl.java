package com.vedroid.server.service;

import com.vedroid.server.exception.ShopNotFound;
import com.vedroid.server.model.Shop;
import com.vedroid.server.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    @Transactional
    public Shop create(Shop shop) {
        Shop createdShop = shopRepository.save(shop);
        return createdShop;
    }

    @Override
    @Transactional
    public Shop findById(int id) {
        return shopRepository.findOne(id);
    }

    @Override
    @Transactional(rollbackFor = ShopNotFound.class)
    public Shop delete(int id) throws ShopNotFound {
        Shop deletedShop = shopRepository.findOne(id);

        if (deletedShop == null)
            throw new ShopNotFound();

        shopRepository.delete(deletedShop);
        return deletedShop;
    }

    @Override
    @Transactional
    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = ShopNotFound.class)
    public Shop update(Shop shop) throws ShopNotFound {
        Shop updatedShop = shopRepository.findOne(shop.getId());

        if (updatedShop == null)
            throw new ShopNotFound();

        updatedShop.setName(shop.getName());
        updatedShop.setEmplNumber(shop.getEmplNumber());
        return updatedShop;
    }

}
