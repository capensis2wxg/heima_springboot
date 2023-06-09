package top.jacktgq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author CandyWall
 * @Date 2022/1/17--19:14
 * @Description
 */
@RestController
@RequestMapping("/books")
public class BookController {
    // 创建记录日志的对象
    private static final Logger LOG = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById() {
        System.out.println("springboot is running...");
        LOG.trace("log trace");
        LOG.debug("log debug ...");
        LOG.info("log info ...");
        LOG.warn("log warn ...");
        LOG.error("log error ...");
        return "springboot is running...";
    }
}
