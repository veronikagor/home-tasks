package javaclasses.maintask;

/**
 * Create the class listed below. Define constructors and methods setType (), getType (), toString ().
 * Define a method in the class that creates an array of objects.
 * Set the criteria for selecting data and display this data on the console.
 * Each class that has information must declare several constructors.
 * Patient: id, Last name, First name, Patronymic, Address, Telephone, Medical record number, Diagnosis.
 * Create list of objects. Output: a) list of patients with this diagnosis;
 * b) list of patients whose medical record number is in the specified interval.
 */
public class Patient {
    private int id;
    private String lastName;
    private String firsName;
    private String patronymic;
    private String address;
    private long telephone;
    private long medicalRecordNumber;
    private String diagnosis;

    public Patient(int id, String lastName, String firsName, String patronymic, String address,
                   long telephone, long medicalRecordNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firsName = firsName;
        this.patronymic = patronymic;
        this.address = address;
        this.telephone = telephone;
        this.medicalRecordNumber = medicalRecordNumber;
        this.diagnosis = diagnosis;
    }

    public Patient(String lastName, String firsName, String patronymic, String address, long medicalRecordNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firsName = firsName;
        this.patronymic = patronymic;
        this.address = address;
        this.medicalRecordNumber = medicalRecordNumber;
        this.diagnosis = diagnosis;
    }

    public Patient(String lastName, String firsName, String patronymic, String address, long telephone, long medicalRecordNumber, String diagnosis) {
        this(lastName, firsName, patronymic, address, medicalRecordNumber, diagnosis);
        this.telephone = telephone;
    }

    public Patient(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public long getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(long medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firsName='" + firsName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", medicalRecordNumber=" + medicalRecordNumber +
                ", Diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
