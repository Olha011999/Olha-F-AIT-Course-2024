package homework_27.pets.test;

import homework_27.pets.dao.PetsHotelImpl;
import homework_27.pets.model.Cat;
import homework_27.pets.model.Dog;
import homework_27.pets.model.Pets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetsHotelImplTest {

    PetsHotelImpl petsHotel;
    Pets[] pets;// Поле класса

    @BeforeEach
    void setUp() {
        petsHotel = new PetsHotelImpl(4);
        pets = new Pets[3];

        // Добавляем тестовые данные
        petsHotel.addPets(new Cat(11111l, "Puschanija", "Canadian Sphynx", 25, true, 0.6, 4));

        petsHotel.addPets(new Dog(11112l, "Kacher", "Bulldog", 40, 0.7, 6.0));
        petsHotel.addPets(new Cat(11113l, "Sharik", "shepherd dog", 45, false, 1.5, 15));

    }

    @Test
    void findPetByIdTest() {
        Pets foundPet = petsHotel.findPetById(11111);
        assertNotNull(foundPet);
        assertEquals("Puschanija", foundPet.getName());

    }

    @Test
    void addPetsTest() {

        //Pets newPet =new Cat(11114l, "Lucky", "British Shorthair", 25, false, 0.6, 4);
        petsHotel.addPets(new Cat(11114l, "Lucky", "British Shorthair", 25, false, 0.6, 4));
        assertEquals(4, petsHotel.getAllPets().length);// проверяем, что питомец добавлен

    }

    @Test
    void calculateRevenueTest() {
       double revenue = petsHotel.calculateRevenue(10);
        System.out.println("Total revenue for 10 days: " + revenue);
        assertEquals(1100, revenue);
    }

    @Test
    void removePetsByBreedTest() {
        assertTrue(petsHotel.removePetsByBreed("Bulldog"));
        assertEquals(2, petsHotel.getAllPets().length);//проверка, что питомец удален
    }

    @Test
    void removePetsByIdTest() {
        assertTrue(petsHotel.removePetsById(11112));
        assertEquals(2, petsHotel.getAllPets().length);//проверка, что питомец удален
    }

    @Test
    void getAllPetsTest() {
        Pets[] allPets = petsHotel.getAllPets();
        for (int i = 0; i < allPets.length; i++) {
            Pets pet = allPets[i];  // обращаемся к питомцу через индекс
            System.out.println(pet.getName());  // выводим имя питомца
        }
    }
}