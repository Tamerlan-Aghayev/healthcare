package entities;

import entities.Diagnoses;
import entities.Doctors;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-02T20:22:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Patients.class)
public class Patients_ { 

    public static volatile SingularAttribute<Patients, String> patientName;
    public static volatile SingularAttribute<Patients, Diagnoses> patientDiagnose;
    public static volatile SingularAttribute<Patients, Doctors> doctorId;
    public static volatile SingularAttribute<Patients, Integer> patientAge;
    public static volatile SingularAttribute<Patients, Integer> id;
    public static volatile SingularAttribute<Patients, String> patientSurname;

}