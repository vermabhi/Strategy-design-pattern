package org.designPatterns.ChainOfResponsibility;

import java.util.Objects;

public class Director extends LeaveApprover{

    @Override
    public void approveLeave(int leaveDays) {
        if (leaveDays<=7){
            System.out.println("Leave Approved by Director!");
        } else  if (Objects.nonNull(nextLeaveApprover)){
            nextLeaveApprover.approveLeave(leaveDays);
        } else {
            System.out.println("Leave Rejected!");
        }
    }
}
