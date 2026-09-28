package network.webtech.labmvc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import network.webtech.labmvc.models.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
