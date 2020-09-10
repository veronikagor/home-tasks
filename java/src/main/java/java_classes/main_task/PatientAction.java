package java_classes.main_task;

import java.util.ArrayList;

public class PatientAction {

    private static ArrayList<Patient> allPatients = new ArrayList<>();

    public void createDefaultArrayOfThePatients() {
        allPatients.add(new Patient(111, "Petrov", "Petr", "Petrovich", "Minsk", 3454657, 1209, "Bronchit"));
        allPatients.add(new Patient(222, "Ivanov", "Ivan", "Ivanovich", "Brest", 2459867, 1210, "Pnevmonia"));
        allPatients.add(new Patient(333, "Antonov", "Anton", "Antonovich", "Grodno", 9884523, 1211, "Otit"));
        allPatients.add(new Patient(444, "Karpov", "Karp", "Karpovich", "Mogilev", 7684024, 1212, "Otit"));
        allPatients.add(new Patient(555, "Sokolov", "Savelij", "Savelievich", "Gomel", 4686721, 1213, "Pnevmonia"));
    }

    public static ArrayList<Patient> printListOfPatientsWithDiagnosis(String diagnosis) {
        ArrayList<Patient> patientsWithDiagnosis = new ArrayList<>();
        for (Patient p : allPatients) {
            if (p.getDiagnosis() != null && p.getDiagnosis().equalsIgnoreCase(diagnosis)) {
                patientsWithDiagnosis.add(p);
            }
        }
        System.out.printf("Patients with diagnosis %s:\n %s\n", diagnosis, patientsWithDiagnosis);
        return patientsWithDiagnosis;
    }

    public static ArrayList<Patient> printListOfPatientsWithMedicalRecordNumberInInterval(int fromNumber, int toNumber) {
        ArrayList<Patient> listOfPatientsWithMedicalRecordNumberInInterval = new ArrayList<>();
        for (Patient patient : allPatients) {
            if (patient.getMedicalRecordNumber() != 0
                    && patient.getMedicalRecordNumber() >= fromNumber
                    && patient.getMedicalRecordNumber() <= toNumber) {
                listOfPatientsWithMedicalRecordNumberInInterval.add(patient);
            }
        }
        System.out.printf("Patients with medical record number in this interval %d - %d :\n %s\n", fromNumber, toNumber, listOfPatientsWithMedicalRecordNumberInInterval);
        return listOfPatientsWithMedicalRecordNumberInInterval;
    }
}
