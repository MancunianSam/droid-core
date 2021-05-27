package uk.gov.nationalarchives.droid.core;

import java.util.ResourceBundle;

public class VersionParser {
    public String getVersion() {
        return ResourceBundle.getBundle("application").getString("version");
    }
}
