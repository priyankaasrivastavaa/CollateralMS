package com.collateral.cucumber;

import com.collateral.CollateralMsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CollateralMsApplication.class)
public class CollateralMsApplicationTests {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
