package javaclasses.maintask;

import static javaclasses.maintask.PatientAction.printListOfPatientsWithASpecificDiagnosis;
import static javaclasses.maintask.PatientAction.printListOfPatientsWithAMedicalRecordNumberIsInASpecificInterval;

public class PatientRunner {
    public static void main(String[] args) {
        new PatientAction().createDefaultArrayOfThePatients();
        printListOfPatientsWithASpecificDiagnosis("Otit");
        printListOfPatientsWithAMedicalRecordNumberIsInASpecificInterval(1200, 1210);
    }
}
