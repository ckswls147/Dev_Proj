package proj.dev_proj.member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import proj.dev_proj.item.Item;
import proj.dev_proj.item.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class ItemRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void findAllItem() {
        //given
        List<Item> itemList = new ArrayList<>();
        //when
        Item item1 = new Item();
        Item item2= new Item();
        Item item3 = new Item();

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        List<Item> allItem = itemRepository.findAllItem();

        //then
        Assert.assertEquals(itemList.size(), allItem.size());

    }
}