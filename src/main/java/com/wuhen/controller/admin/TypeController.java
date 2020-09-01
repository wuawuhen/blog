package com.wuhen.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhen.entity.Type;
import com.wuhen.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * 2020/7/27 8:49
 * by 无痕ぐ
 */
@Controller
@RequestMapping("/admin")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @GetMapping("/types")
    public  String list(Model model,@RequestParam(defaultValue = "1",value = "pagenum") Integer pagenum){

        PageHelper.startPage(pagenum, 5);

        List<Type> allType = typeService.getAllType();

        //得到分页结果对象

        PageInfo<Type> pageInfo = new PageInfo<>(allType);

        model.addAttribute("pageInfo", pageInfo);

        return "admin/types";
    }

    @GetMapping("/types/input")
    public  String input(Model model){

        model.addAttribute("type", new Type());
        return  "admin/types-input";
    }

    @GetMapping("/types/{id}/input")
    public String editInput(@PathVariable Long id,Model model){
    model.addAttribute("type",typeService.getType(id));
    return "admin/types-input";
    }

    @PostMapping("/types")
    public  String  post(Type type, RedirectAttributes attributes){
        Type byName = typeService.getByName(type.getName());
        if (byName!=null){
            attributes.addFlashAttribute("msg","不能添加重复分类");
            return "redirect:/admin/types/input";
        }else {
            attributes.addFlashAttribute("msg","添加成功");
        }
        typeService.saveType(type);
        return  "redirect:/admin/types";
    }

    @PostMapping("/types/{id}")
    public  String  editpost(Type type,@PathVariable Long id, RedirectAttributes attributes){
        Type byName = typeService.getByName(type.getName());
        if (byName!=null){
            attributes.addFlashAttribute("msg","不能添加重复分类");
            return "redirect:/admin/types/input";
        }else {
            attributes.addFlashAttribute("msg","添加成功");
        }
        type.setId(id);
        typeService.updateType(type);
        return  "redirect:/admin/types";
    }

    @GetMapping("/types/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes){
        typeService.deleteType(id);
        attributes.addFlashAttribute("msg", "删除成功");
        return "redirect:/admin/types";
    }
}
