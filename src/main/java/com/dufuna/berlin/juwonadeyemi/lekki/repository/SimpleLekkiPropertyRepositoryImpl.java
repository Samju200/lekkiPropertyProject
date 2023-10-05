package com.dufuna.berlin.juwonadeyemi.lekki.repository;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    private final Map<String, LekkiProperty> propertyMap = new HashMap<>();
    public LekkiProperty save(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(),property);
        return property;
    }

    public LekkiProperty findById(String id) {
        return propertyMap.get(id);
    }


    public List<LekkiProperty> findAll() {
        return new ArrayList<>(propertyMap.values());
    }


    public void update(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(), property);
    }
}
