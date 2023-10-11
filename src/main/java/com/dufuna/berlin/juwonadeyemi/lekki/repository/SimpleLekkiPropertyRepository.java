package com.dufuna.berlin.juwonadeyemi.lekki.repository;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;

import java.util.List;
/**
 * An interface defining the contract for managing Lekki properties in a repository.
 * <p>
 * This interface outlines methods for saving, retrieving, and updating Lekki property records in a data store.
 * Implementations of this interface provide specific data storage and retrieval mechanisms.
 * </p>
 * <p>
 * The key methods defined in this interface include:
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#save(LekkiProperty)}:
 *   Saves a Lekki property record in the data store.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#findById(String)}:
 *   Retrieves a Lekki property by its unique identifier from the data store.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#findAll()}:
 *   Retrieves all stored Lekki property records from the data store.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepository#update(LekkiProperty)}:
 *   Updates an existing Lekki property record in the data store.
 * </p>
 * <p>
 * Implementations of this interface offer different storage solutions, such as in-memory data stores, databases, or
 * external services. Developers can create custom implementations based on their data storage needs.
 * </p>
 */
public interface SimpleLekkiPropertyRepository {

    /**
     * Saves a Lekki property record in the data store.
     *
     * @param property The Lekki property to be saved.
     * @return The saved Lekki property.
     */
    LekkiProperty save(LekkiProperty property);

    /**
     * Retrieves a Lekki property by its unique identifier from the data store.
     *
     * @param id The unique identifier of the Lekki property.
     * @return The Lekki property with the specified ID, or null if not found.
     */
    LekkiProperty findById(String id);

    /**
     * Retrieves all stored Lekki property records from the data store.
     *
     * @return A list of all Lekki property records in the data store.
     */
    List<LekkiProperty> findAll();

    /**
     * Updates an existing Lekki property record in the data store.
     *
     * @param property The updated Lekki property.
     * @return The updated Lekki property.
     */
    LekkiProperty update(LekkiProperty property);
}

