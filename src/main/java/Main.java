import net.cloudburo.drools.config.DroolsBeanFactory;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main {
    protected KieSession kSession;
    protected Logger logger = LoggerFactory.getLogger("Main");
    protected Resource resource;

    public void init() {
        resource = ResourceFactory.newClassPathResource("net/cloudburo/drools/rules/MyRules.xlsx", getClass());
        kSession = new DroolsBeanFactory().getKieSession(resource);
    }

    public static void main(String[] args) {
        Main sm = new Main();
        sm.init();
        System.out.println(new DroolsBeanFactory().getDrlFromExcel("net/cloudburo/drools/rules/MyRules.xlsx"));

    }
}
