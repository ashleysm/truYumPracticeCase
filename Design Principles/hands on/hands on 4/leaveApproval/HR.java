package leaveApproval;

public class HR implements ILeaveRequestHandler{

	@Override
	public void HandleRequest(LeaveRequest request) {
		int leave=request.getLeaveDays();
		if(leave>5 && leave<=7) {
			System.out.println("HR : Leave Request by "+request.getEmployee()+" approved [Days: "+leave+" ]");
		}
		else
		{
			System.out.println("HR : Leave Request by "+request.getEmployee()+" rejected [Days: "+leave+" ]");
		}
	}

}