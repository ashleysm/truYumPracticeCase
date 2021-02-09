package leaveApproval;

public class Supervisor implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler=new ProjectManager();
	@Override
	public void HandleRequest(LeaveRequest request) {
		int leave=request.getLeaveDays();
		if(leave>=1 && leave<3) {
			System.out.println("Supervisor : Leave Request by "+request.getEmployee()+" approved [Days: "+leave+" ]");
		}
		else {
			nextHandler.HandleRequest(request);
		}
	}

}