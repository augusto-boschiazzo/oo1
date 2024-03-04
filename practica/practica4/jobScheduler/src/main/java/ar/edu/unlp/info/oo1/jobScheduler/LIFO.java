package ar.edu.unlp.info.oo1.jobScheduler;

import java.util.List;

public class LIFO implements Strategy {
	public JobDescription getJob(List<JobDescription> lista) {
		return lista.get(lista.size()-1);
	}
}
