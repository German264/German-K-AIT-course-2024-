package homework_32_marafon.pet.dao;

import homework_32_marafon.pet.model.Pet;

public interface House {

    // CRUD methods

    public boolean addPet(Pet pet);

    void printPet();

    public Pet[] findPetByNickname(String nickname);

    public Pet[] findDogByBreed(String nickname);

    // find by breed
    public Pet[] findCatByBreed(String breed);

    public Pet removePet(int id);

    Pet updatePet(Pet pet);

    public int size();
}

