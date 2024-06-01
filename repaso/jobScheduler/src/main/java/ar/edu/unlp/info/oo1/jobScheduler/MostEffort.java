package ar.edu.unlp.info.oo1.jobScheduler;

public class MostEffort extends JobScheduler {
	
	public MostEffort() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = null;
		this.getJobs().stream()
		  .max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
		  .orElse(null);
		unschedule(nextJob);
		return nextJob;
	}
	

}
