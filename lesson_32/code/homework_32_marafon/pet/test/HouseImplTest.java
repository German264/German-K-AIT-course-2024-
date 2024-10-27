package homework_32_marafon.pet.test;

import classwork_32.employee.model.Employee;
import classwork_32.employee.model.SalesManager;
import classwork_32.employee.model.Worker;
import homework_32_marafon.dokument_arhive.model.Dokument;
import homework_32_marafon.pet.dao.House;
import homework_32_marafon.pet.dao.HouseImpl;
import homework_32_marafon.pet.model.Cat;
import homework_32_marafon.pet.model.Dog;
import homework_32_marafon.pet.model.Pet;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

public class HouseImplTest {        //????????????

    House house;
    Pet[] pets;

    @BeforeEach
    void setUp() {
        house = new HouseImpl(7);
        pets = new Pet[6];

        // Создаем животных
        pets[0] = new Dog(01, "собака", 3, "Барбос", "дворняга", 70, 1.8);
        pets[1] = new Dog(02, "собака", 7, "Бобик", "мастиф", 110, 16);
        pets[2] = new Dog(03, "собака", 4, "Жучка", "дворняга", 60, 1.6);
        pets[3] = new Cat(04, "кошка", 6, "Шельма", "корниш", 30, 6);
        pets[4] = new Cat(05, "кот", 2, "Бегемот", "дворянин", 30, 7);
        pets[5] = new Cat(06, "кот", 4, "Люцифер", "корниш", 25, 5);

        // TODO поместить объекты emp[] в объект company с помощью метода addEmployee
        for (int i = 0; i < 6; i++) {
            house.addPet(pets[i]);
        }
    }

    @Test
    public void addPetTest() {
// check size
        assertEquals(6, house.size());
        // can't add null
        assertFalse(house.addPet(null));
        // can't add duplicate
        assertFalse(house.addPet(pets[1]));
        // can add new one employee
        Pet newPets = new Dog(07, "собака", 8, "Кабысдох", "дворняга", 80, 7);
        assertTrue(house.addPet(newPets));
        // check size
        assertEquals(7, house.size());
        // can't add one more employee
        Pet oneMorePets = new Cat(10, "кот", 10, "Мурзик", "сфинкс", 35, 4);   //????????????????
        assertFalse(house.addPet(oneMorePets));
    }

    @Test
    public void printPetTest() {
        house.printPet();
    }

    @Test
    public void findPetByNicknameTest() {
        Pet[] expected = {pets[1]};
        Pet[] actual = house.findPetByNickname("Бобик");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findDogByBreedTest() {
        Pet[] expected = {pets[0], pets[2]};
        Pet[] actual = house.findDogByBreed("дворняга");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findCatByBreedTest() {
        Pet[] expected = {pets[3], pets[5]};
        Pet[] actual = house.findCatByBreed("корниш");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removePetTest() {
        // can remove existed
        assertEquals(pets[1], house.removePet(02));
        // check size
        assertEquals(5, house.size());
        // can't remove absent
        assertNull(house.removePet(11));  //????????????????????????????????????
    }

    @Test
    public void updatePetTest() {
        Pet updatePet = new Cat(04, "кошка", 6, "Шельма", "корниш", 30, 6);
        assertEquals("NewName", house.updatePet(updatePet).getNickname());
        house.printPet();
    }

    @Test
    public void sizeTest() {
        assertEquals(6, house.size());
    }
}