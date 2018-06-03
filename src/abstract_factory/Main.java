package abstract_factory;

/**
 * Created by root on 03/06/18.
 */
public class Main {
    public static void main(String[] args) {
        GUIBuilder guiBuilder = new GUIBuilder();
        String os = System.getProperty("os.name").toUpperCase();
        AbstractWidgetFactory widgetFactory = null;
        if(os=="LINUX"){
            widgetFactory  = new LinuxWidgetFactory();
        } else {
            widgetFactory  = new MSWindowsWidgetFactory();
        }
        guiBuilder.buildWinodw(widgetFactory);
    }
}
