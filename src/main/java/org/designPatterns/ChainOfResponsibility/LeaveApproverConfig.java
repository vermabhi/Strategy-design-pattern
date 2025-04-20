package org.designPatterns.ChainOfResponsibility;

import java.util.Objects;

public class LeaveApproverConfig {

    private static LeaveApprover leaveApprover = null;

    private LeaveApproverConfig(){

    }

    public static LeaveApprover getLeaveApprover(){
        if(Objects.nonNull(leaveApprover)){
            return leaveApprover;
        }
        Supervisor supervisor = new Supervisor();
        Director director = new Director();
        Manager manager = new Manager();
        supervisor.setNextLeaveApprover(manager);
        manager.setNextLeaveApprover(director);

        leaveApprover = supervisor;
        return leaveApprover;
    }
}
