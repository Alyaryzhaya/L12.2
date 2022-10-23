import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;
import ru.netology.repository.ProductRepository;

public class ProductRepositoryTest {

    // конструктор
    PurchaseItem item1 = new PurchaseItem(11, 1, "хлеб", 40, 3); // переисляем все данные, которые нужны конструктору
    PurchaseItem item2 = new PurchaseItem(222, 22, "булка", 30, 1); // переисляем все данные, которые нужны конструктору
    PurchaseItem item3 = new PurchaseItem(3, 30, "картошка", 20, 7); // переисляем все данные, которые нужны конструктору


    @Test
    public void test(){
        ProductRepository repo = new ProductRepository();

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId());

        // в результате мы ожидаем, то будет следующий массив
        PurchaseItem[] expected = {item1, item3};

        // фактический результат - то то запомнил наш репозиторий
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected,actual);

    }
}
