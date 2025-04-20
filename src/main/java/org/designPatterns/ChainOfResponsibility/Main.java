package org.designPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        LeaveApprover leaveApprover = LeaveApproverConfig.getLeaveApprover();
        leaveApprover.approveLeave(10);
    }
}
