package org.designPatterns.ChainOfResponsibility;

public abstract class LeaveApprover {

    protected LeaveApprover nextLeaveApprover;

    public void setNextLeaveApprover(LeaveApprover nextLeaveApprover) {
        this.nextLeaveApprover = nextLeaveApprover;
    }

    public abstract void approveLeave(int leaveDays);
}
