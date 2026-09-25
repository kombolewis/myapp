package coreservlets;

public class ServletUtilities {
    public static final String DOCTYPE = "<!DOCTYPE html>";
    public static  String headWithTitle(String title) {
        return (DOCTYPE + "\n" + "<html> \n" + "<head><title>" + title + "</title></head>");
    }
}
