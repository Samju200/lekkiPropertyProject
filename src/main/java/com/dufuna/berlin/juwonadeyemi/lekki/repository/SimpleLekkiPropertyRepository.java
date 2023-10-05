package com.dufuna.berlin.juwonadeyemi.lekki.repository;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);
    LekkiProperty findById(String id);
    List<LekkiProperty> findAll();
    void update(LekkiProperty property);
}
