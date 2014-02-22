package com.scrumboard.models.command;

/**
 * Edit task command
 */
public interface EditTaskCommand extends Command {

    /**
     * Edits task
     */
    void editTask();
}
