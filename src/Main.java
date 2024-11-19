public enum Priority {

    LOW("Low urgency"),

    MEDIUM("Medium urgency"),

    HIGH("High urgency");



    private final String description;



    // Constructor for the enum

    Priority(String description) {

        this.description = description;

    }



    // Getter for description

    public String getDescription() {

        return description;

    }

}

