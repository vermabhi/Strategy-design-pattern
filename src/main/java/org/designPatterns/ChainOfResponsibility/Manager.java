package org.designPatterns.ChainOfResponsibility;

import java.util.Objects;

public class Manager extends LeaveApprover {

    @Override
    public void approveLeave(int leaveDays) {
        if (leaveDays<=5){
            System.out.println("Leave Approved by Manager!");
        } else if (Objects.nonNull(nextLeaveApprover)){
            nextLeaveApprover.approveLeave(leaveDays);
        }
    }
}
