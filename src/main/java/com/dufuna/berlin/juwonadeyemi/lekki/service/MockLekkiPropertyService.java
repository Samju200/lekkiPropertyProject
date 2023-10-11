package com.dufuna.berlin.juwonadeyemi.lekki.service;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;
import com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;
/**
 * A mock implementation of the {@link com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService}
 * interface that provides services for managing Lekki properties.
 * <p>
 * This class is intended for testing and demonstration purposes. It uses a
 * {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepositoryImpl} as a
 * data repository for managing Lekki properties. The service methods offered include saving properties,
 * retrieving individual properties, retrieving all properties, and updating property records.
 * </p>
 * <p>
 * The core methods in this implementation include:
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.MockLekkiPropertyService#saveProperty(LekkiProperty)}:
 *   Saves a Lekki property by delegating the operation to the associated repository.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.MockLekkiPropertyService#getProperty(String)}:
 *   Retrieves a Lekki property by its unique identifier from the associated repository.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.MockLekkiPropertyService#getProperties()}:
 *   Retrieves all stored Lekki property records from the associated repository.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.MockLekkiPropertyService#update(LekkiProperty)}:
 *   Updates an existing Lekki property record by delegating the operation to the associated repository.
 * </p>
 * <p>
 * The service constructor takes an instance of
 * {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepositoryImpl} as a parameter,
 * which serves as the data store for Lekki properties. This allows for integration with different repository
 * implementations and data sources.
 * </p>
 */

public class MockLekkiPropertyService implements LekkiPropertyService {
    private final SimpleLekkiPropertyRepositoryImpl propertyRepository;
    /**
     * Constructs a MockPropertyService with the specified repository.
     *
     * @param propertyRepository The repository for storing and managing Lekki properties.
     */
    public MockLekkiPropertyService(SimpleLekkiPropertyRepositoryImpl propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    /**
     * Saves a Lekki property in the associated repository.
     *
     * @param property The Lekki property to be saved.
     * @return The saved Lekki property.
     */
    public LekkiProperty saveProperty(LekkiProperty property){
        propertyRepository.save(property);
        return property;
    }
    /**
     * Retrieves a Lekki property by its unique identifier from the associated repository.
     *
     * @param id The unique identifier of the Lekki property.
     * @return The Lekki property with the specified ID, or null if not found.
     */
    @Override
    public LekkiProperty getProperty(String id) {
        return propertyRepository.findById(id);
    }

    /**
     * Retrieves all stored Lekki property records from the associated repository.
     *
     * @return A list of all Lekki property records in the data store.
     */

    @Override
    public List<LekkiProperty> getProperties() {
        return propertyRepository.findAll();
    }
    /**
     * Updates an existing Lekki property record in the associated repository.
     *
     * @param property The updated Lekki property.
     */
    @Override
    public void update(LekkiProperty property) {
        propertyRepository.update(property);
    }
}
