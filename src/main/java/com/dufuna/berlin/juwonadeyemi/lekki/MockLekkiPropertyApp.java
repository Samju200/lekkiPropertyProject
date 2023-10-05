package com.dufuna.berlin.juwonadeyemi.lekki;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;
import com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.juwonadeyemi.lekki.service.MockLekkiPropertyService;

import java.util.List;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        SimpleLekkiPropertyRepositoryImpl propertyRepository = new SimpleLekkiPropertyRepositoryImpl();


        LekkiPropertyService propertyService =
                new MockLekkiPropertyService(propertyRepository);

        // Create and save multiple LekkiProperty objects
        for (int i = 1; i <= 10; i++) {
            LekkiProperty property = new LekkiProperty();
            property.setPropertyId("ID" + i);
            property.setPropertyAddress("No " + i + " Adimarity way Lekki , Lagos");
            property.setPropertyType("Resident");
            property.setNumberOfBedrooms(1 + 1);
            property.setNumberOfSittingRooms(2);
            property.setNumberOfKitchens(1);
            property.setNumberOfBathrooms(2);
            property.setNumberOfToilets(2);
            property.setPropertyOwner("Juwon Adeyemi");
            property.setDescription("Spacious family home");
            property.setValidFrom("2023-09-25");
            property.setValidTo("2023-12-31");
            propertyService.saveProperty(property);
        }
        // Get and print a single LekkiProperty
        LekkiProperty retrievedProperty = propertyService.getProperty("ID3");
        if (retrievedProperty != null) {
            System.out.println("Retrieved Property: " + retrievedProperty);
        } else {
            System.out.println("Property not found.");
        }

        // Get and print all LekkiProperty objects
        System.out.println("All Properties:");
        List<LekkiProperty> properties = propertyService.getProperties();
        for (LekkiProperty property : properties) {
            System.out.println(property);
        }
    }


}
