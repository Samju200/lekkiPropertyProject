package com.dufuna.berlin.juwonadeyemi.lekki.service;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);
    LekkiProperty getProperty(String id);
    List<LekkiProperty> getProperties();
}
