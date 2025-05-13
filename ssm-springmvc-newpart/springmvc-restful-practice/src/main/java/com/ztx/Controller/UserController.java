package com.ztx.Controller;

import com.ztx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("User")
@ResponseBody
public class UserController {

    /*
     * 模拟分页查询业务接口
     */
    @GetMapping
    public Object queryPage(@RequestParam(name = "page",required = false,defaultValue = "1") int page,
                            @RequestParam(name = "size",required = false,defaultValue = "10") int size) {
        System.out.println("page = " + page + ", size = " + size);
        System.out.println("分页查询业务!");
        return "{'status':'ok'}";
    }

    /**
     * 模拟用户保存业务接口
     */
    @PostMapping
    public Object saveUser(User user) {
        System.out.println("user = " + user);
        System.out.println("用户保存业务!");
        return "{'status':'ok'}";
    }

    /**
     * 模拟用户详情业务接口
     */
    @GetMapping("/{id}")
    public Object detailUser(@PathVariable Integer id) {
        System.out.println("id = " + id);
        System.out.println("用户详情业务!");
        return "{'status':'ok'}";
    }

    /**
     * 模拟用户更新业务接口
     */
    @PutMapping
    public Object updateUser(@RequestBody User user) {
        System.out.println("user = " + user);
        System.out.println("用户更新业务!");
        return "{'status':'ok'}";
    }

    /**
     * 模拟条件分页查询业务接口
     */
    @GetMapping("search")
    public Object queryPage(@RequestParam(name = "page",required = false,defaultValue = "1")int page,
                            @RequestParam(name = "size",required = false,defaultValue = "10")int size,
                            @RequestParam(name = "keyword",required= false)String keyword){
        System.out.println("page = " + page + ", size = " + size + ", keyword = " + keyword);
        System.out.println("条件分页查询业务!");
        return "{'status':'ok'}";
    }
}
