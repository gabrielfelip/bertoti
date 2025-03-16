package eng3.pattern;

public class LogObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("[LOG] " + message);
    }
}