package com.scrumboard.models;

import com.scrumboard.models.command.AddCommand;
import com.scrumboard.models.command.AddTaskAttachmentCommand;
import com.scrumboard.models.command.DeleteTaskCommand;
import com.scrumboard.models.command.EditTaskCommand;
import com.scrumboard.models.command.EditTaskStageCommand;

import java.util.Date;

/**
 * Base scrum stage
 */
public abstract class Stage {

    protected String mStageName;
    protected Date mStartDate;
    private AddCommand mAddCommand;
    private AddTaskAttachmentCommand mAddTaskAttachmentCommand;
    private DeleteTaskCommand mDeleteTaskCommand;
    private EditTaskCommand mEditTaskCommand;
    private EditTaskStageCommand mEditTaskStageCommand;

    public Stage(){

    }

    public Stage(String name){
        this.mStageName = name;
    }

    public String getStageName() {
        return mStageName;
    }

    public void setStageName(String mStageName) {
        this.mStageName = mStageName;
    }

    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date mStartDate) {
        this.mStartDate = mStartDate;
    }

    public AddCommand getAddCommand() {
        return mAddCommand;
    }

    public void setAddCommand(AddCommand mAddCommand) {
        this.mAddCommand = mAddCommand;
    }

    public AddTaskAttachmentCommand getAddTaskAttachmentCommand() {
        return mAddTaskAttachmentCommand;
    }

    public void setAddTaskAttachmentCommand(AddTaskAttachmentCommand mAddTaskAttachmentCommand) {
        this.mAddTaskAttachmentCommand = mAddTaskAttachmentCommand;
    }

    public DeleteTaskCommand getDeleteTaskCommand() {
        return mDeleteTaskCommand;
    }

    public void setDeleteTaskCommand(DeleteTaskCommand mDeleteTaskCommand) {
        this.mDeleteTaskCommand = mDeleteTaskCommand;
    }

    public EditTaskCommand getEditTaskCommand() {
        return mEditTaskCommand;
    }

    public void setEditTaskCommand(EditTaskCommand mEditTaskCommand) {
        this.mEditTaskCommand = mEditTaskCommand;
    }

    public EditTaskStageCommand getEditTaskStageCommand() {
        return mEditTaskStageCommand;
    }

    public void setEditTaskStageCommand(EditTaskStageCommand mEditTaskStageCommand) {
        this.mEditTaskStageCommand = mEditTaskStageCommand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stage)) return false;

        Stage stage = (Stage) o;

        if (!mAddCommand.equals(stage.mAddCommand)) return false;
        if (!mAddTaskAttachmentCommand.equals(stage.mAddTaskAttachmentCommand)) return false;
        if (!mDeleteTaskCommand.equals(stage.mDeleteTaskCommand)) return false;
        if (!mEditTaskCommand.equals(stage.mEditTaskCommand)) return false;
        if (!mEditTaskStageCommand.equals(stage.mEditTaskStageCommand)) return false;
        if (!mStageName.equals(stage.mStageName)) return false;
        if (!mStartDate.equals(stage.mStartDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mStageName.hashCode();
        result = 31 * result + mStartDate.hashCode();
        result = 31 * result + mAddCommand.hashCode();
        result = 31 * result + mAddTaskAttachmentCommand.hashCode();
        result = 31 * result + mDeleteTaskCommand.hashCode();
        result = 31 * result + mEditTaskCommand.hashCode();
        result = 31 * result + mEditTaskStageCommand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "mStageName='" + mStageName + '\'' +
                ", mStartDate=" + mStartDate +
                ", mAddCommand=" + mAddCommand +
                ", mAddTaskAttachmentCommand=" + mAddTaskAttachmentCommand +
                ", mDeleteTaskCommand=" + mDeleteTaskCommand +
                ", mEditTaskCommand=" + mEditTaskCommand +
                ", mEditTaskStageCommand=" + mEditTaskStageCommand +
                '}';
    }
}
