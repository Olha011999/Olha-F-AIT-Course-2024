package homework_27.pets.dao;

import homework_27.pets.model.Pets;

public interface PetsHotel {

    Pets findPetById(long id);

    Pets addPets(Pets pet);

    double calculateRevenue(int days);

    boolean removePetsByBreed(String breed);

    boolean removePetsById(int id);

    Pets[] getAllPets();




}