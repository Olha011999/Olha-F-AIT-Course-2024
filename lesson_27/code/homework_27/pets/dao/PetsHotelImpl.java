package homework_27.pets.dao;

import homework_27.pets.model.Pets;

public class PetsHotelImpl implements PetsHotel {
    Pets[] pets;
    private int size;

    public PetsHotelImpl(int capasity){
        pets = new Pets[capasity];
        size = 0;
    }


    public Pets findPetById(long id) {
        for (int i = 0; i < size; i++) {
            if (pets[i].getId() == id) {  // Проверяем, совпадает ли ID питомца
                System.out.println("Pet found: " + pets[i].getName());
                return pets[i];  // Возвращаем найденного питомца
            }
        }
        System.out.println("Pet with ID " + id + " not found.");
        return null;  // Питомец не найден
    }


    @Override
    public Pets addPets(Pets pet) {
        if (size < pets.length) {  // проверяем, есть ли место в массиве
            pets[size] = pet;  // добавляем питомца в массив
            size++;
            System.out.println("Pet added: " + pet.getName());
            return pet;  // возвращаем добавленного питомца
        } else {
            System.out.println("There is no room for a new pet.");
            return null;  // возвращаем null, если добавление не удалось
        }

    }


    @Override
    // подсчитываем доход
    public double calculateRevenue(int days) {
        double revenue= 0;
        for (int i = 0; i < size; i++) {
            if (pets[i] != null){
                revenue += pets[i].getDailyCost()* days;
            }
        }
        return revenue;
    }


    @Override
    //удаление питомца по породе
    public boolean removePetsByBreed(String breed) {
        for (int i = 0; i < size; i++) {
            if (pets[i].getBreed().equals(breed)) {  // Найти питомца по породе
                // Сдвинуть элементы влево, чтобы удалить питомца
                for (int j = i; j < size - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[size - 1] = null;  // Очистить последний элемент
                size--;  // Уменьшить размер
                System.out.println("Pet removed: " + breed);
                return true;  // Успешно удалено
            }
        }
        System.out.println("Pet with a breed " + breed + " not found.");
        return false;  // Питомец не найден
    }

    @Override
    public boolean removePetsById(int id) {
        for (int i = 0; i < size; i++) {
            if (pets[i].getId() == id) {  // Найти питомца по ID
                // Сдвинуть элементы влево, чтобы удалить питомца
                for (int j = i; j < size - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[size - 1] = null;  // Очистить последний элемент
                size--;  // Уменьшить размер
                System.out.println("Pet: " + id+ " removed.");
                return true;  // Успешно удалено
            }
        }
        System.out.println("Pet with ID " + id + " not found.");
        return false;  // Питомец не найден
    }


    @Override

    public Pets[] getAllPets() {
        Pets[] currentPets = new Pets[size];  // Создаём новый массив для текущих питомцев
        for (int i = 0; i < size; i++) {
            currentPets[i] = pets[i];  // Копируем текущих питомцев в новый массив
        }
        return currentPets;  // Возвращаем массив текущих питомцев
    }
}

