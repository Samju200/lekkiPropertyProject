package com.dufuna.berlin.juwonadeyemi.lekki.repository;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Implementation of the {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository}
 * interface that provides an in-memory storage solution for managing Lekki properties.
 * <p>
 * This class uses a {@code Map<String, LekkiProperty>} as an in-memory data store to manage Lekki property
 * records, with the property ID serving as the unique identifier key. It implements the core repository methods
 * for storing, retrieving, updating, and managing Lekki property data.
 * </p>
 * <p>
 * The key methods in this implementation include:
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#save(LekkiProperty)}:
 *   Saves a Lekki property record in the in-memory data store.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#findById(String)}:
 *   Retrieves a Lekki property by its unique identifier from the in-memory data store.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#findAll()}:
 *   Retrieves all stored Lekki property records from the in-memory data store.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#update(LekkiProperty)}:
 *   Updates an existing Lekki property record in the in-memory data store.
 * </p>
 * <p>
 * This implementation serves as a basic storage solution suitable for testing and prototyping purposes.
 * </p>
 */
public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    private final Map< String, LekkiProperty> propertyMap = new HashMap<>();
    /**
     * Saves a Lekki property in the in-memory data store.
     *
     * @param property The Lekki property to be saved.
     * @return The saved Lekki property.
     */
    public LekkiProperty save(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(), property);
        return property;
    }

    /**
     * Retrieves a Lekki property by its unique identifier from the in-memory data store.
     *
     * @param id The unique identifier of the Lekki property.
     * @return The Lekki property with the specified ID, or null if not found.
     */
    @Override
    public LekkiProperty findById(String id) {
        return  propertyMap.get(id);
    }
    /**
     * Retrieves all stored Lekki property records from the in-memory data store.
     *
     * @return A list of all Lekki property records in the data store.
     */
    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(propertyMap.values());
    }

    /**
     * Updates an existing Lekki property record in the in-memory data store.
     *
     * @param property The updated Lekki property.
     * @return The updated Lekki property.
     */
    @Override
    public LekkiProperty update(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(), property);
        return property;
    }
}
