package com.scrumboard.models.command;

/**
 * Base interface object for command
 */
public interface Command {

    /**
     * Roll back changes
     */
    void rollback();
}
