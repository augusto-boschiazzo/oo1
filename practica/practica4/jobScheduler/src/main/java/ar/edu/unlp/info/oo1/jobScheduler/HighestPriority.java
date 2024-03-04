package ar.edu.unlp.info.oo1.jobScheduler;

import java.util.List;

public class HighestPriority implements Strategy {

	@Override
	public JobDescription getJob(List<JobDescription> lista) {
		return lista.stream()
        .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
        .orElse(null);
	}

}
