package vunam.libraries;

public class LibraryTwo extends LibraryOne{
    public LibraryTwo(String name, String version) {
        super(name, version);
    }

    public void run() {
        System.out.println("LibraryOne output: " + getName() + " and version: " + getVersion());
    }
}
