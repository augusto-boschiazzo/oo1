package ar.edu.unlp.info.oo1.jobScheduler;

public class LIFO extends JobScheduler {
	
	public LIFO() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = this.getJobs().get(this.getJobs().size() - 1);
		return nextJob;
	}
	

}
