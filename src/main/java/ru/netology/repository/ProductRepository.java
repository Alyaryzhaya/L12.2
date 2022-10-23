package ru.netology.repository;
// РЕПОЗИТОРИЙ

import ru.netology.domain.PurchaseItem;

public class ProductRepository {
    private  PurchaseItem[] items = new PurchaseItem[0]; // поле


    public void save(PurchaseItem item){  // метод добавления и хранения покупки
    PurchaseItem [] tmp = new PurchaseItem[items.length + 1];  // создаем новый массив, на 1 больше
        for (int i = 0; i < items.length ; i++) {  // копируем все из старого массива в новый
          tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }



    public void removeById(int id) { // метод удаления покупки по id
        PurchaseItem[] tmp = new PurchaseItem[items.length - 1]; //  новый массив, на 1 эл-т меньше
                int copyToIndex = 0;  // переменная, КУДА надо будет копировать в новом массиве
        for (PurchaseItem item : items){
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp; // теперь items это  tmp (?)
    }



    public PurchaseItem[] getItems() { // метод возвращает все заполненные элементы в виде массива
      return items;
    }
}


