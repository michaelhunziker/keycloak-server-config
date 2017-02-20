package example.keycloak.server;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.keycloak.server.KeycloakServerFraction;
/**
 * Class for bootstrapping Wildfly Swarm.
 * 
 */
public class CloudSSOServerApplication {

	public static void main(String[] args) {
		try {
			new CloudSSOServerApplication().run();
		} catch (Exception e) {
            System.out.println(System.getProperty("java.class.path"));
			throw new RuntimeException(e);
		}
	}

	private final Swarm swarm;

	public CloudSSOServerApplication() throws Exception {
        System.out.println(System.getProperty("java.class.path"));
    
		swarm = new Swarm();
// swarm.getCommandLine();
//		KeycloakServerFraction kcf = new KeycloakServerFraction();
//		
//		kcf.theme("defaults", theme -> {
//		   theme.dir("/var/keycloak/theme"); 
//		});
//		swarm.fraction(kcf);
		swarm.start();

}

	private void run() throws Exception {
		swarm.deploy();
	}

}
