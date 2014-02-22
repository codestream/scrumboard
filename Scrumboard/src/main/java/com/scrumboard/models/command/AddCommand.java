package com.scrumboard.models.command;

/**
 * Add task command
 */
public interface AddCommand extends Command {

    /**
     * Adds a new task
     */
    void addTask();
}
