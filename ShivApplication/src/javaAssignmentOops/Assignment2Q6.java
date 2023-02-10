package javaAssignmentOops;

abstract class Persistence {
    abstract public String persist();
}

class FilePersistence extends Persistence {
    @Override
    public String persist() {
        return "Data persisted to a file";
    }
}

class DatabasePersistence extends Persistence {
    @Override
    public String persist() {
        return "Data persisted to a database";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
        Persistence persistence = getPersistence();
        System.out.println(persistence.persist());
    }

    public static Persistence getPersistence() {
        // In a real-world scenario, you would implement logic here to determine
        // whether data should be saved to a file or a database
        return new FilePersistence();
    }
}

