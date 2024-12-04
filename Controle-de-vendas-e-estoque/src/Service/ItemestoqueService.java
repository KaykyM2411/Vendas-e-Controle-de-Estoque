package Service;

import Repository.EstoqueRepository;
import Repository.ItemestoqueRepository;

public class ItemestoqueService {
    private ItemestoqueRepository ir;
    private EstoqueRepository er;

    public ItemestoqueService() {
        ir = ItemestoqueRepository.getInstance();
        er = EstoqueRepository.getInstance();
    }


}
