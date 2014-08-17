package com.vedroid.server.dao;

import com.vedroid.server.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ShopDAO extends JpaRepository<Shop, Long> {
    String dbName = "Shop"; // must be equals to com.vedroid.server.model.Shop

    @Modifying
    @Transactional
    @Query("DELETE FROM " + dbName)
    void deleteAllFromTable();
}
