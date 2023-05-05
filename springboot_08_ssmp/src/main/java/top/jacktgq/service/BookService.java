package top.jacktgq.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import top.jacktgq.pojo.Book;

import java.util.List;

/**
 * @Author CandyWall
 * @Date 2022/1/20--12:03
 * @Description
 */
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    Boolean save(Book book);

    /**
     * 更新
     * @param book
     */
    Boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return
     */
    Boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Book> getAll();

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    IPage<Book> getPage(int currentPage, int pageSize);
}
