package vunam.libraries;

public class LibraryOne {

    String name;

    String version;

    public LibraryOne(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public void run() {
        System.out.println("LibraryOne print: " + getName() + " and version: " + getVersion());
    }
}
