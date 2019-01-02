package net.cloudburo.drools.service;

import net.cloudburo.drools.config.DroolsBeanFactory;
import net.cloudburo.drools.model.Label;
import net.cloudburo.drools.model.Patient;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

import static org.junit.Assert.assertEquals;

public class RaceLabelTest {
    private KieSession kSession;

    @Before
    public void setup() {
        Resource resource = ResourceFactory.newClassPathResource("net/cloudburo/drools/rules/MyRules.xlsx", getClass());
        kSession = new DroolsBeanFactory().getKieSession(resource);
        System.out.println(new DroolsBeanFactory().getDrlFromExcel("net/cloudburo/drools/rules/MyRules.xlsx"));
    }

    @Test
    public void PatientLabel() throws Exception {

        Patient patient = new Patient();
        patient.setAge("81");
        patient.setGender("Male");
        patient.setRace("Chinese");

        kSession.insert(patient);
        Label label = new Label();
        kSession.setGlobal("label", label);
        kSession.fireAllRules();
        assertEquals(label.getValue(), "Senio Chinese Male");
    }
}
