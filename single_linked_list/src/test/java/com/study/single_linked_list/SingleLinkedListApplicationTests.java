package com.study.single_linked_list;

import com.study.single_linked_list.entity.Node;
import com.study.single_linked_list.utils.NodeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SingleLinkedListApplicationTests {

    @Test
    void test01() {
        NodeUtil.addData(1);
    }


    @Test
    void test02() {

        NodeUtil.traverse(new Node(1));
    }


}
