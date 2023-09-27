package com.dufuna.berlin.juwonadeyemi.lekki.service;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService{
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }


    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null; // You can return a sample LekkiProperty here if needed
    }
}
