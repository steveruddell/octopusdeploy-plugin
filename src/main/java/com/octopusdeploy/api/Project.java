package com.octopusdeploy.api;

/**
 * Represents a project from the OctopusDeploy API.
 */
public class Project {
    private final String name;
    public String getName() {
        return name;
    }
    
    private final String id;
    public String getId() {
        return id;
    }
    
    public Project(String id, String name) {
        this.id = id;
        this.name = name;
    }
            
}
