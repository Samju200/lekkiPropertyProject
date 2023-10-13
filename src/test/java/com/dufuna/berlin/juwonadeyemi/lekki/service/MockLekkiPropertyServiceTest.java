package com.dufuna.berlin.juwonadeyemi.lekki.service;
import com.dufuna.berlin.juwonadeyemi.lekki.model.LekkiProperty;
import com.dufuna.berlin.juwonadeyemi.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



class MockLekkiPropertyServiceTest  {
    @Mock
    private SimpleLekkiPropertyRepositoryImpl propertyRepository;
    @InjectMocks
    private MockLekkiPropertyService mockLekkiPropertyService;



    @BeforeEach
    public void setup() {

        propertyRepository = mock(SimpleLekkiPropertyRepositoryImpl.class);

    }

    @Test
    public void testSaveProperty() {
        LekkiProperty property = new LekkiProperty();
        when(propertyRepository.save(property)).thenReturn(property);
        LekkiProperty property1 = new LekkiProperty();
        LekkiProperty savedProperty = mockLekkiPropertyService.saveProperty(property1);
        verify(propertyRepository, times(2)).save(property1);
        assertEquals(property, savedProperty);
    }

    @Test
    public void testGetProperty() {
        String propertyId = "id3";
        LekkiProperty property = new LekkiProperty();
        when(propertyRepository.findById(propertyId)).thenReturn(property);

        LekkiProperty retrievedProperty = mockLekkiPropertyService.getProperty(propertyId);

        verify(propertyRepository, times(1)).findById(propertyId);
        assertEquals(property, retrievedProperty);
    }

    @Test
    public void testGetProperties() {
        List<LekkiProperty> properties = new ArrayList<>();
        when(propertyRepository.findAll()).thenReturn(properties);

        List<LekkiProperty> retrievedProperties = mockLekkiPropertyService.getProperties();

        verify(propertyRepository, times(1)).findAll();
        assertEquals(properties, retrievedProperties);
    }

    @Test
    public void testUpdateProperty() {
        LekkiProperty property = new LekkiProperty();
        mockLekkiPropertyService.update(property);

        verify(propertyRepository, times(1)).update(property);
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