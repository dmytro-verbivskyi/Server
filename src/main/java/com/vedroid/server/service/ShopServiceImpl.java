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
        return shopRepository.create(shop);
    }

    @Override
    @Transactional
    public Shop findById(Long id) {
        return shopRepository.findById(id);
    }

    @Override
    @Transactional(rollbackFor = ShopNotFound.class)
    public Shop delete(Long id) throws ShopNotFound {
        Shop deletedShop = shopRepository.findById(id);

        if (deletedShop == null) {
            throw new ShopNotFound();
        }
        shopRepository.delete(id);
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
        Shop updatedShop = shopRepository.findById(shop.getId());

        if (updatedShop == null) {
            throw new ShopNotFound();
        }
        updatedShop.setName(shop.getName());
        updatedShop.setEmplNumber(shop.getEmplNumber());
        return updatedShop;
    }

}
