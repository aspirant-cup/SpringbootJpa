package com.lyw.handler;
import com.lyw.po.Grade;
import com.lyw.service.GradeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @outhor LiYouWei
 * @create 2020/11/28-9:48
 */
@RestController
@RequestMapping("/grade")
public class GradeHandler {
    @Resource
    private GradeService gradeService;
    @GetMapping("")
    public Object findAll(Model model){
        List<Grade> all = gradeService.findAll();
        model.addAttribute("list",all);
        return all;
    }
}
