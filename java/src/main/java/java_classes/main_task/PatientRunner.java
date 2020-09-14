package java_classes.main_task;

import static java_classes.main_task.PatientAction.printListOfPatientsWithDiagnosis;
import static java_classes.main_task.PatientAction.printListOfPatientsWithMedicalRecordNumberInInterval;

public class PatientRunner {
    public static void main(String[] args) {
        new PatientAction().createDefaultArrayOfThePatients();
        printListOfPatientsWithDiagnosis("Otit");
        printListOfPatientsWithMedicalRecordNumberInInterval(1200, 1210);
    }
}
