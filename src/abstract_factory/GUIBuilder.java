package abstract_factory;

/**
 * Created by root on 03/06/18.
 */
public class GUIBuilder {
    public void buildWinodw(AbstractWidgetFactory widgetFactory){
        Window window = widgetFactory.createWindow();
        window.setTitle("New Window");
    }
}
