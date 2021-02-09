package leaveApproval;

public class ProjectManager implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler=new HR();
	
	@Override
	public void HandleRequest(LeaveRequest request) {
		int leave=request.getLeaveDays();
		if(leave>=3 && leave<=5) {
			System.out.println("Project Manager : Leave Request by "+request.getEmployee()+" approved [Days: "+leave+" ]");
		}
		else {
			nextHandler.HandleRequest(request);
		}
		
	}

}