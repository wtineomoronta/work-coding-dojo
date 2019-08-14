import domain.Person;

public class ArrayPractice {

    private String stringArray[];
    private int intArray[];
    private Double doubleArray[];
    private Person personArray[][];

    public String stringArrayValueByPosition(int i) {
        return stringArray[i];
    }

    public int intArrayValueByPosition(int i) {
        return intArray[i];
    }

    public Double doubleArrayValueByPosition(int i) {
        return doubleArray[i];
    }


    public String personNameArrayValueByPosition(int i, int i1) {
        return personArray[i][i1].getName();
    }

    public int personEdadArrayValueByPosition(int i, int i1) {
        return personArray[i][i1].getAge();
    }

    //------------------------- Getter and Setter ----------------------------

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public void setDoubleArray(Double[] doubleArray) {
        this.doubleArray = doubleArray;
    }

    public void setPersonArray(Person[][] personArray) {
        this.personArray = personArray;
    }
}
