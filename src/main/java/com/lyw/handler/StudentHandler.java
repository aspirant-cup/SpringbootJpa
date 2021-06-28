package com.lyw.handler;

import com.lyw.po.Student;
import com.lyw.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @outhor LiYouWei
 * @create 2020/11/27-12:10
 */
@Controller
@RequestMapping("/student")
public class StudentHandler {
    @Resource
    private StudentService studentService;
    @GetMapping("")
    public String findAll( Model model){
        List<Student> all = studentService.findAll();
        model.addAttribute("page",all);
        return "findAll";
    }
    @GetMapping("/inde")
    public String index(){
        return "insert";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        studentService.delete(id);
        return "redirect:/student";
    }
    @PostMapping("")
    public String insert(Student student){
        studentService.save(student);
        return "redirect:/student";
    }
    @GetMapping("{id}")
    public String findById(@PathVariable("id") int id,Model model){
        model.addAttribute("stu",studentService.findById(id));
        return "update";
    }
    @PutMapping("")
    public String update(Student student){
        studentService.save(student);
        return "redirect:/student";
    }
}
