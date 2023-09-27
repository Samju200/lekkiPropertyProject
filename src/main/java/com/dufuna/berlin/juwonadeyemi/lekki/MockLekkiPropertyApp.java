package com.dufuna.berlin.juwonadeyemi.lekki;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;
import com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.juwonadeyemi.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {
        // Create a LekkiProperty
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId(12345);
        property.setPropertyAddress("12 Adimarity way  ");
        property.setPropertyType("House");
        property.setNumberOfBedrooms(3);
        property.setNumberOfSittingRooms(2);
        property.setNumberOfKitchens(1);
        property.setNumberOfBathrooms(2);
        property.setNumberOfToilets(2);
        property.setPropertyOwner("Juwon Adeyemi");
        property.setDescription("Spacious family home");
        property.setValidFrom("2023-09-25");
        property.setValidTo("2023-12-31");

        LekkiPropertyService propertyService = new MockLekkiPropertyService();

        // Save the LekkiProperty
        propertyService.saveProperty(property);

        // Get a LekkiProperty
        LekkiProperty retrievedProperty = propertyService.getProperty();

    }

}
