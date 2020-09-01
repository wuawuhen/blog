package com.wuhen.controller;

/**
 * 2020/8/31 15:13
 * by 无痕ぐ
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about() {
        return "music";
    }

}