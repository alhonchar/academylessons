package org.academy;

public class MainConfig {

    private static String read(String value) {
        return ConfigurationReader.get().readValue(value);
    }

    public static String getUrl() {
        return read("main_url");
    }

    public static String getBrowser() {
        return read("browser");
    }

    public static String getPassword() {
        return read("pass");
    }

    public static String getLogin() {
        return read("login");
    }

    public static String getPageUrl(String name){return read("main_url") + read(name);}

    public static String getParam(String param) {return read(param);}

    public static String getSearchApp() {
        return read("searchApp");
    }

    public static String getIssuesUrl() {
        return read("issues_url");
    }

    public static String getIssue21420Url() {
        return read("issue21420_url");
    }

    public static String getFile() {
        return read("file_properties");
    }

    public static String getCollaborator() {
        return read("collaborator");
    }
}
