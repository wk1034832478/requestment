package home.hyywk.top.requestment.controllers;

import home.hyywk.top.requestment.msg.Result;
import home.hyywk.top.requestment.pojo.Requestment;

import home.hyywk.top.requestment.service.RequestmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class RequestManageController {

    private Logger logger = LoggerFactory.getLogger( RequestManageController.class );

    @Autowired
    private RequestmentService requestmentService;

    /**
     * 接受到新的请求
     * @return
     */
    @PostMapping("request")
    public Result insertNew( @RequestBody Requestment requestment) { //
        this.logger.info( "收到新的请求," + requestment.toString() );
        this.requestmentService.addOne( requestment );
        return Result.get201( "成功" );
    }

}
