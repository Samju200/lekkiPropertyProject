package com.dufuna.berlin.juwonadeyemi.lekki.service;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;
import com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService{
    private final SimpleLekkiPropertyRepositoryImpl propertyRepository;

    public MockLekkiPropertyService(SimpleLekkiPropertyRepositoryImpl propertyRepository) {
        this.propertyRepository = propertyRepository;
    }


    public LekkiProperty saveProperty(LekkiProperty property) {
        propertyRepository.save(property);
        System.out.println("MockLekkiPropertyService.saveProperty called");
        return property;
    }


    public LekkiProperty getProperty(String id) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return propertyRepository.findById(id);
    }
    public List<LekkiProperty> getProperties() {
        System.out.println("MockLekkiPropertyService.getProperties called");
        return propertyRepository.findAll();
    }
}
