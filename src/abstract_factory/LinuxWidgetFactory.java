package abstract_factory;

/**
 * Created by root on 03/06/18.
 */
public class LinuxWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
