package top.jacktgq.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import top.jacktgq.pojo.Book;

/**
 * @Author CandyWall
 * @Date 2022/1/20--12:49
 * @Description
 */
public interface IBookService extends IService<Book> {
    /**
     * 获取分页对象
     * @param currentPage
     * @param pageSize
     * @return
     */
    IPage<Book> getPage(int currentPage, int pageSize);

    /**
     * 获取分页对象
     * @param currentPage
     * @param pageSize
     * @param book
     * @return
     */
    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
