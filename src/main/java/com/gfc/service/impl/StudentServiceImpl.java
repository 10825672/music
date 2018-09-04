/**
 * FileName: StudentServiceImpl
 * Author:   大橙子
 * Date:     2018/9/4 18:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gfc.service.impl;

import com.gfc.mapper.StudentMapper;
import com.gfc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 大橙子
 * @create 2018/9/4
 * @since 1.0.0
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Map<String, Object>> listStudent() {
        return studentMapper.listStudent();
    }
}
