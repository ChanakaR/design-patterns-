package abstract_factory;

/**
 * Created by root on 03/06/18.
 */
public class MSWindowsWidgetFactory implements AbstractWidgetFactory{
    @Override
    public Window createWindow() {
        return new MSWindowsWindow();
    }
}
