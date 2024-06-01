package ar.edu.unlp.info.oo1.jobScheduler;

public class HighestPriority extends JobScheduler {
	
	public HighestPriority() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = null;
		this.getJobs().stream()
					  .max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
					  .orElse(null);
		this.unschedule(nextJob);
		return nextJob;
	}

}
