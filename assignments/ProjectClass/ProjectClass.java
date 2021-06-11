class ProjectClass {
    private String name;
    private String description;
    public ProjectClass() {
    }

    public ProjectClass(String name){
        this.name = name;
        System.out.println("Cereal Name: " + name);
    }

    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
        System.out.println("Cereal Name: " + name + "Cereal Description" + description);
    }
}
