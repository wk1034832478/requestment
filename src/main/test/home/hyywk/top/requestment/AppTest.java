package home.hyywk.top.requestment;

import home.hyywk.top.requestment.jpa.RequestmentJpa;
import home.hyywk.top.requestment.pojo.Requestment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    private Logger logger = LoggerFactory.getLogger( AppTest.class );

    @Autowired
    private RequestmentJpa requestmentJpa;

    /**
     * 测试插入是否正确，是否插入后出现中文乱码问题
     */
    @Test
    public void contextLoads() {
        Requestment requestment = new Requestment("aa", "aa", "aa", "aa", "好", "好", "好");
        requestmentJpa.save( requestment );
        Requestment requestment1 = requestmentJpa.findById(1l).get();
        this.logger.info( "公司经营范围：", requestment1.getCorporationRange() );
    }

}
