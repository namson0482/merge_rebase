package vunam;

import vunam.features.FeatureOne;

public class MainApp {

    public MainApp() {
        FeatureOne featureOne = new FeatureOne("Feature One");
        featureOne.run();
    }

    public static void main(String[] args) {
        new MainApp();
    }
}
