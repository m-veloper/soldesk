package utils;

import java.io.IOException;
import java.net.URISyntaxException;

@FunctionalInterface
public interface WindowHandler {
    void openWebBrowser() throws URISyntaxException, IOException;
}
