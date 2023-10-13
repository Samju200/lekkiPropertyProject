package com.dufuna.berlin.juwonadeyemi.lekki.repository;
import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class SimpleLekkiPropertyRepositoryImplTest {

    private final SimpleLekkiPropertyRepositoryImpl propertyRepository = new SimpleLekkiPropertyRepositoryImpl();

    @BeforeAll
    public static void setupAll() {
        System.out.println("Should Print Before All Tests");
    }

    @Test
    public void testSaveProperty() {
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId("ID3");

        LekkiProperty savedProperty = propertyRepository.save(property);

        assertEquals(property, savedProperty);
        assertEquals(property, propertyRepository.findById("ID3"));
    }

    @Test
    public void testFindById() {
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId("123");
        propertyRepository.save(property);

        LekkiProperty retrievedProperty = propertyRepository.findById("123");

        assertEquals(property, retrievedProperty);
    }

    @Test
    public void testFindByAll() {
        LekkiProperty property1 = new LekkiProperty();
        property1.setPropertyId("ID1");
        propertyRepository.save(property1);

        LekkiProperty property2 = new LekkiProperty();
        property2.setPropertyId("ID2");
        propertyRepository.save(property2);

        List<LekkiProperty> properties = propertyRepository.findAll();

        assertEquals(2, properties.size());
    }

    @Test
    public void testUpdateProperty() {
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId("ID3");
        propertyRepository.save(property);

        property.setPropertyOwner("William Street,Lekki");
        LekkiProperty updatedProperty = propertyRepository.update(property);

        assertEquals("William Street,Lekki", updatedProperty.getPropertyOwner());
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Should Execute After Each Test");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Should be executed at the end of the Test");
    }
}
