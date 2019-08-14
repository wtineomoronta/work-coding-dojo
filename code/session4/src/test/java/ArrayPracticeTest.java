import domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPracticeTest {

    private ArrayPractice arrayPractice;

    @BeforeEach
    public void setUp() {
        arrayPractice = new ArrayPractice();
    }

    @Test
    public void testStringArray() {

        String stringArray[] = {"Jose", "Juan", "Julio", "Cesar"};
        arrayPractice.setStringArray(stringArray);

        assertEquals("Jose", arrayPractice.stringArrayValueByPosition(0));
        assertEquals("Juan", arrayPractice.stringArrayValueByPosition(1));
        assertEquals("Julio", arrayPractice.stringArrayValueByPosition(2));
        assertEquals("Cesar", arrayPractice.stringArrayValueByPosition(3));
    }

    @Test
    public void testIntArray() {

        int intArray[] = {3, 5, 8, 9};
        arrayPractice.setIntArray(intArray);

        assertEquals(3, arrayPractice.intArrayValueByPosition(0));
        assertEquals(5, arrayPractice.intArrayValueByPosition(1));
        assertEquals(8, arrayPractice.intArrayValueByPosition(2));
        assertEquals(9, arrayPractice.intArrayValueByPosition(3));
    }

    @Test
    public void testDoubleArray() {

        Double doubleArray[] = {10.25, 43.54, 23.21, 20.0};
        arrayPractice.setDoubleArray(doubleArray);

        assertEquals(10.25, arrayPractice.doubleArrayValueByPosition(0).doubleValue());
        assertEquals(43.54, arrayPractice.doubleArrayValueByPosition(1).doubleValue());
        assertEquals(23.21, arrayPractice.doubleArrayValueByPosition(2).doubleValue());
        assertEquals(20.0, arrayPractice.doubleArrayValueByPosition(3).doubleValue());
    }

    @Test
    public void testPersonArray() {
        // Setting the persons[][] array
        Person teacher1 = new Person("Juan", 25);
        Person teacher2 = new Person("Yanet", 32);
        Person teacher3 = new Person("Julio", 40);
        Person teacher4 = new Person("Jose", 28);

        Person student1 = new Person("Pedro", 18);
        Person student2 = new Person("Marcos", 21);
        Person student3 = new Person("Mary", 17);
        Person student4 = new Person("Marta", 20);

        Person assessor1 = new Person("Mercedes", 43);
        Person assessor2 = new Person("Maria", 45);
        Person assessor3 = new Person("Mateo", 36);
        Person assessor4 = new Person("Carlos", 48);

        Person persons[][] = {
                {teacher1, teacher2, teacher3, teacher4},
                {student1, student2, student3, student4},
                {assessor1, assessor2, assessor3, assessor4}
        };

        arrayPractice.setPersonArray(persons);

        // Test teacher value
        assertEquals("Juan", arrayPractice.personNameArrayValueByPosition(0,0));
        assertEquals(25, arrayPractice.personEdadArrayValueByPosition(0,0));

        // Test student
        assertEquals("Mary", arrayPractice.personNameArrayValueByPosition(1,2));
        assertEquals(17, arrayPractice.personEdadArrayValueByPosition(1,2));

        // Test assessor value
        assertEquals("Carlos", arrayPractice.personNameArrayValueByPosition(2,3));
        assertEquals(48, arrayPractice.personEdadArrayValueByPosition(2,3));
    }


}