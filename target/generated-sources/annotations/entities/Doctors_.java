package entities;

import entities.Patients;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-02T20:22:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Doctors.class)
public class Doctors_ { 

    public static volatile SingularAttribute<Doctors, String> doctorName;
    public static volatile SingularAttribute<Doctors, String> field;
    public static volatile SingularAttribute<Doctors, String> doctorscol;
    public static volatile SingularAttribute<Doctors, String> doctorSurname;
    public static volatile CollectionAttribute<Doctors, Patients> patientsCollection;
    public static volatile SingularAttribute<Doctors, Integer> id;

}