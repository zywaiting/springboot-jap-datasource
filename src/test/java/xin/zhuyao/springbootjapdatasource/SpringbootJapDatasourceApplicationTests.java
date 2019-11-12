package xin.zhuyao.springbootjapdatasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.zhuyao.springbootjapdatasource.repository.primary.UserPrimaryRepository;
import xin.zhuyao.springbootjapdatasource.repository.second.UserSecondRepository;

@SpringBootTest
class SpringbootJapDatasourceApplicationTests {

    @Autowired
    private UserPrimaryRepository userPrimaryRepository;
    @Autowired
    private UserSecondRepository userSecondRepository;

    @Test
    void contextLoads() {
        System.out.println(userPrimaryRepository.findAll());
        System.out.println(userSecondRepository.findAll());
    }

}
