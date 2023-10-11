
package com.dufuna.berlin.juwonadeyemi.lekki.model;

import java.util.Objects;

/**
 * Represents a Lekki Property with various attributes.
 * This class provides methods to get and set property details.
 */

public class LekkiProperty {
    /**
     * The unique identifier of the Lekki Property.
     */
    private String propertyId;
    /**
     * The address of the Lekki Property.
     */
    private String propertyAddress;

    /**
     * The type of the Lekki Property (e.g., house, flat).
     */
    private String propertyType;
    /**
     * The number of bedrooms in the Lekki Property.
     */
    private int numberOfBedrooms;

    /**
     * The number of bathrooms in the Lekki Property.
     */
    private int numberOfBathrooms;

    /**
     * The number of sitting rooms in the Lekki Property.
     */
    private int numberOfSittingRooms;

    /**
     * The number of kitchens in the Lekki Property.
     */
    private int numberOfKitchens;

    /**
     * The number of toilets in the Lekki Property.
     */
    private int numberOfToilets;

    /**
     * The owner of the Lekki Property.
     */
    private String propertyOwner;

    /**
     * A description of the Lekki Property.
     */
    private String description;

    /**
     * The valid-from date of the Lekki Property.
     */

    private String validFrom;

    /**
     * The valid-to date of the Lekki Property.
     */

    private String validTo;
    /**
     * Default constructor for the LekkiProperty class.
     * Creates an instance of LekkiProperty with default values for its attributes.
     */

    public LekkiProperty() {
    }
    /**
     * Gets the property's unique identifier.
     *
     * @return The property's unique identifier as a string.
     */
    public String getPropertyId() {
        return propertyId;
    }
    /**
     * Sets the property's unique identifier.
     *
     * @param propertyId The new unique identifier to set for the property.
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }
    /**
     * Gets the property's address.
     *
     * @return The property's address as a string.
     */
    public String getPropertyAddress() {
        return propertyAddress;
    }
    /**
     * Sets the property's address.
     *
     * @param propertyAddress The new address to set for the property.
     */

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }
    /**
     * Gets the type of the property (e.g., house, flat).
     *
     * @return The property's type as a string.
     */
    public String getPropertyType() {
        return propertyType;
    }
    /**
     * Sets the type of the property.
     *
     * @param propertyType The new type to set for the property.
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }



    /**
     * Gets the type of the numbers of bedrooms.
     *
     * @return The property's bedrooms as an int.
     */
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * Sets the number of bathrooms of the property.
     *
     * @param numberOfBedrooms The new numberOfBathrooms to set for the property.
     */
    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
    /**
     * Gets the type of the numbers of sitting rooms.
     *
     * @return The property's sitting rooms as an int.
     */
    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }
    /**
     * Sets the number of sitting rooms of the property.
     *
     * @param numberOfSittingRooms The new numberOfSittingRooms to set for the property.
     */
    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }
    /**
     * Gets the type of the numbers of Kitchens.
     *
     * @return The property's kitchens as an int.
     */
    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    /**
     * Sets the number of kitchens of the property.
     *
     * @param numberOfKitchens The new numberOfKitchens to set for the property.
     */
    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    /**
     * Gets the type of the numbers of bathrooms.
     *
     * @return The property's bathrooms as an int.
     */
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    /**
     * Sets the number of bathrooms of the property.
     *
     * @param numberOfBathrooms The new numberOfBathrooms to set for the property.
     */
    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }
    /**
     * Gets the type of the numbers of toilets.
     *
     * @return The property's toilets as an int.
     */
    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    /**
     * Sets the number of toilets of the property.
     *
     * @param numberOfToilets The new numberOfToilets to set for the property.
     */
    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    /**
     * Gets the person that owner the property.
     *
     * @return The property's owner as a string.
     */
    public String getPropertyOwner() {
        return propertyOwner;
    }

    /**
     * Sets the property owner of the property.
     *
     * @param propertyOwner The new property owner to set for the property.
     */
    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }
    /**
     * Gets the description of the property.
     *
     * @return The property's description as a string.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the property.
     *
     * @param description The new numberOfSittingRooms to set for the property.
     */

    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Gets the valid date of the property.
     *
     * @return The property's valid date as a string.
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the valid from of the property.
     *
     * @param validFrom The new validFrom to set for the property.
     */
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * Gets the valid expired date of the property.
     *
     * @return The property's valid to as a string.
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Sets the valid to of the property.
     *
     * @param validTo The new validTo to set for the property.
     */
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    /**
     * Returns a string representation of the LekkiProperty object.
     * The string includes property ID, address, and type as comma-separated fields.
     *
     * @return A formatted string representing the LekkiProperty object.
     */
    @Override
    public String toString() {
        return "LekkiProperty{" +
                "propertyId='" + propertyId + '\'' +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertyType='" + propertyType + '\'' +
                '}';
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     * Two LekkiProperty objects are considered equal if their property IDs are the same.
     *
     * @param o The object to compare to this LekkiProperty.
     * @return {@code true} if this LekkiProperty is equal to the provided object, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LekkiProperty)) return false;
        LekkiProperty property = (LekkiProperty) o;
        return Objects.equals(propertyId, property.propertyId);
    }
    /**
     * Returns a hash code value for the LekkiProperty object based on its property ID.
     *
     * @return A hash code value for the LekkiProperty object.
     */

    @Override
    public int hashCode() {
        return Objects.hash(propertyId);
    }
}
