package org.designPatterns.ChainOfResponsibility;

import java.util.Objects;

public class Supervisor extends LeaveApprover {

    @Override
    public void approveLeave(int leaveDays) {
        if (leaveDays<=3){
            System.out.println("Leave Approved by Supervisor!");
        } else  if (Objects.nonNull(nextLeaveApprover)){
            nextLeaveApprover.approveLeave(leaveDays);
        }
    }
}
