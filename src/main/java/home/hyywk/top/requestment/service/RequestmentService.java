package home.hyywk.top.requestment.service;

import home.hyywk.top.requestment.jpa.RequestmentJpa;
import home.hyywk.top.requestment.pojo.Requestment;
import home.hyywk.top.requestment.util.MessageReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RequestmentService {

    private Logger logger = LoggerFactory.getLogger(RequestmentService.class);

    @Autowired
    private RequestmentJpa requestmentJpa;

    /**
     * 添加单个
     * @param requestment
     */
    public void addOne( Requestment requestment ) {
        try {
            this.requestmentJpa.save( requestment );
            MessageReport.sendMessage( "15605459957", requestment.getId().toString() );
        } catch (IOException e) {
            e.printStackTrace();
            this.logger.info( e.getMessage() );
        } catch (Exception e2 ) {
            e2.printStackTrace();
            this.logger.info( e2.getMessage() );
        }
    }

}
