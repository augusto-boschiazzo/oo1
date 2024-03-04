package ar.edu.unlp.info.oo1.jobScheduler;

import java.util.List;

public class FIFO implements Strategy {
	public JobDescription getJob(List<JobDescription> lista) {
		return lista.get(0);
	}
	

}
