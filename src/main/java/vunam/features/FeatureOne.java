package vunam.features;

public class FeatureOne {

    String message;

    public FeatureOne(String msg) {
        this.message = msg;
    }

    public void run() {
        System.out.println("FeatureOne run: " + message);
    }
}
