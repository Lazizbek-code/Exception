package tasks;

public class ProgrammingLanguage {
    private String name;
    private String owner;
    private String releaseDate;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(String name, String owner, String releaseDate) {
        this.name = name;
        this.owner = owner;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public static void main(String[] args) {
        ProgrammingLanguage language = null;

        try {
            System.out.println("Programming Language: " + language.getName());
            System.out.println("Owner: " + language.getOwner());
            System.out.println("Release Date: " + language.getReleaseDate());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException yakalandı: " + e.getMessage());
        }
    }
}


