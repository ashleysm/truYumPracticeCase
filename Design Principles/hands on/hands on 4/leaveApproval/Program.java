package leaveApproval;

public class Program {

	public static void main(String[] args) {
		LeaveRequest request1= new LeaveRequest("Sree",10);
		Supervisor supervisor=new Supervisor();
		supervisor.HandleRequest(request1);
		
	}

}
