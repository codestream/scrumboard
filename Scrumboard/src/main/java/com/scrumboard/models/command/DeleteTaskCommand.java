package com.scrumboard.models.command;

/**
 * Delete task command
 */
public interface DeleteTaskCommand extends Command {

    /**
     * Deletes a task
     */
    void deleteTask();
}
