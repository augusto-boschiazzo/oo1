package ar.edu.unlp.info.oo1.jobScheduler;

public class FIFO extends JobScheduler{
	
	public FIFO() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = this.getJobs().get(0);
		this.unschedule(nextJob);
		return nextJob;
	}
	

}
