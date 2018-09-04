/**
 * FileName: MusicController
 * Author:   大橙子
 * Date:     2018/9/4 8:17
 * Description: 曲库接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gfc.controller;

import com.gfc.service.StudentService;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈曲库接口〉
 *
 * @author 大橙子
 * @create 2018/9/4
 * @since 1.0.0
 */

/**
 * 该注解会将该类下所有方法以ResponseBody方式响应返回
 */
@RestController
public class MusicController {

    @Resource
    private StudentService studentService;

    @GetMapping("hello")
    private String hello(){
        System.out.println("###################  ");

        List<Map<String, Object>> stuList = studentService.listStudent();

        Iterator<Map<String, Object>> it = stuList.iterator();
        while (it.hasNext()) {
            Map<String, Object> map = it.next();
            System.out.println(map);
        }

        return "aaaaaaa";
    }
}
