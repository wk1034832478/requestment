package home.hyywk.top.requestment.jpa;

import home.hyywk.top.requestment.pojo.Requestment;
import org.springframework.data.repository.CrudRepository;

public interface RequestmentJpa extends CrudRepository<Requestment, Long> {
}
