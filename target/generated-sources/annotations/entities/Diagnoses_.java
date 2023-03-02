package entities;

import entities.Patients;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-02T20:22:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Diagnoses.class)
public class Diagnoses_ { 

    public static volatile CollectionAttribute<Diagnoses, Patients> patientsCollection;
    public static volatile SingularAttribute<Diagnoses, Integer> id;
    public static volatile SingularAttribute<Diagnoses, String> diagnoseName;

}