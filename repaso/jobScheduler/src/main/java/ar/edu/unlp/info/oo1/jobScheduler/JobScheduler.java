package ar.edu.unlp.info.oo1.jobScheduler;

import java.util.LinkedList;
import java.util.List;

public abstract class JobScheduler {
	private List<JobDescription> jobs;
	
	public JobScheduler() {
		this.jobs = new LinkedList<JobDescription>();
	}
	
	public void schedule(JobDescription job) {
		jobs.add(job);
	}
	
	public void unschedule(JobDescription job) {
		if (job != null) {
			this.jobs.remove(job);
		}
	}
	
	protected List<JobDescription> getJobs() {
		return jobs;
	}
	
	public abstract JobDescription next();
	

}
