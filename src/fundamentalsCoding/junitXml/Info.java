package fundamentalsCoding.junitXml;

public class Info {

    private String name;
    private String id;
    private String elapsedTime;

    public Info(String name, String id, String elapsedTime) {
        this.name = name;
        this.id = id;
        this.elapsedTime = elapsedTime;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", elapsedTime='" + elapsedTime + '\'' +
                '}';
    }
}

