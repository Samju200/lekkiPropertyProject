package com.dufuna.berlin.juwonadeyemi.lekki.service;

import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;

import java.util.List;

/**
 * An interface defining the contract for providing services related to managing Lekki properties.
 * <p>
 * This interface outlines methods for performing operations on Lekki property records, including saving,
 * retrieving, updating, and listing property records. Implementations of this interface offer services for
 * interacting with Lekki properties, typically through the use of a repository.
 * </p>
 * <p>
 * The key methods defined in this interface include:
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService#saveProperty(LekkiProperty)}:
 *   Saves a Lekki property record.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService#getProperty(String)}:
 *   Retrieves a Lekki property by its unique identifier.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService#getProperties()}:
 *   Retrieves a list of all stored Lekki property records.
 * - {@link com.dufuna.berlin.juwonadeyemi.lekki.service.LekkiPropertyService#update(LekkiProperty)}:
 *   Updates an existing Lekki property record.
 * </p>
 * <p>
 * Implementations of this interface offer specific services for managing Lekki properties, such as adding,
 * querying, updating, and listing properties. Developers can create custom implementations based on their
 * service needs.
 * </p>
 */
public interface LekkiPropertyService {

    /**
     * Saves a Lekki property record.
     *
     * @param property The Lekki property to be saved.
     * @return The saved Lekki property.
     */
    LekkiProperty saveProperty(LekkiProperty property);

    /**
     * Retrieves a Lekki property by its unique identifier.
     *
     * @param id The unique identifier of the Lekki property.
     * @return The Lekki property with the specified ID, or null if not found.
     */
    LekkiProperty getProperty(String id);

    /**
     * Retrieves a list of all stored Lekki property records.
     *
     * @return A list of all Lekki property records.
     */
    List<LekkiProperty> getProperties();

    /**
     * Updates an existing Lekki property record.
     *
     * @param property The updated Lekki property.
     */
    void update(LekkiProperty property);
}

