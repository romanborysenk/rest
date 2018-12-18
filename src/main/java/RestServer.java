import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class RestServer {

    public static void main(String[] args) throws Exception{
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        Server server = new Server(8090);
        server.setHandler(context);
        ServletHolder jerseyServlet = context.addServlet(ServletContainer.class,"/*");
        jerseyServlet.setInitOrder(0);
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames",
                config.Users.class.getCanonicalName());
        try {
            server.start();
            server.join();
        }
        finally {
            server.destroy();
        }

    }
}
