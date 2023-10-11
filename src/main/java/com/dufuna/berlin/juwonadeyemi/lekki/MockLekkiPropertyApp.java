package com.dufuna.berlin.juwonadeyemi.lekki;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;
import com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.juwonadeyemi.lekki.service.MockLekkiPropertyService;

import java.util.List;
/**
 * A simple application for testing and demonstrating Lekki Property Management functionality.
 * <p>
 * This class contains the main entry point for the application. It creates a mock repository and service,
 * generates sample Lekki property data, and performs operations like saving, retrieving, and updating property
 * records. This serves as a test and demonstration of the Lekki Property Management System.
 * </p>
 * <p>
 * The key functionality of this application includes:
 * - Creating a mock repository and service for managing Lekki properties.
 * - Generating sample Lekki property data within a loop and saving them to the repository.
 * - Prompting the user to input a property ID and retrieving the corresponding property.
 * - Displaying information about the retrieved property, indicating if it was found or not.
 * - Listing all properties stored in the repository.
 * - Prompting the user to update the address and type of a property and then updating it.
 * </p>
 * <p>
 * This application is designed for educational and testing purposes, and it showcases the basic operations
 * of a Lekki Property Management System. It is not intended for production use.
 * </p>
 */
public class MockLekkiPropertyApp {
    /**
     *  Application logic goes here for save, findById and findAll
     */
    public static void main(String[] args) {

        SimpleLekkiPropertyRepositoryImpl propertyRepository = new SimpleLekkiPropertyRepositoryImpl();

        LekkiPropertyService propertyService = getPropertyService(propertyRepository);


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

    private static LekkiPropertyService getPropertyService(SimpleLekkiPropertyRepositoryImpl propertyRepository) {
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
        return propertyService;
    }


}
