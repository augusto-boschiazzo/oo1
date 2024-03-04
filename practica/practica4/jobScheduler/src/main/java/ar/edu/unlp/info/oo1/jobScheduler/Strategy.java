package ar.edu.unlp.info.oo1.jobScheduler;

import java.util.List;

public interface Strategy {
	public JobDescription getJob(List<JobDescription> lista);
}
