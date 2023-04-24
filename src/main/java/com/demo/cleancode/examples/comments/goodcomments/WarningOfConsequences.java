package com.demo.cleancode.examples.comments.goodcomments;

/*
the initializeDatabase method drops all tables in the database and recreates them, effectively wiping out all existing data.
To warn other developers of this consequence, a comment has been added to the code
 */

public class WarningOfConsequences {
    private Database database;

    public void initializeDatabase() {
        // Warning: This method will drop all tables in the database and recreate them.
        // This will result in the loss of all data currently stored in the database.
        database.dropAllTables();
        database.createAllTables();
    }
}

class Database {
    public void dropAllTables() { /* drops all tables */ }
    public void createAllTables() {/* creates all tables */}
}
