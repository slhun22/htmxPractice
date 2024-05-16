package com.example.htmxTest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class APIController {

    @GetMapping("/ticket")
    public String GetTicket() {
        return "  <ul class=\"board\">\n" +
                "        <li class=\"fl tc w70 list t_line lt_line\">2</li>\n" +
                "        <li class=\"fl tc w500 list t_line lt_line\">와랄라</li>\n" +
                "        <li class=\"fl tc w120 list t_line lt_line\">손봉봉</li>\n" +
                "        <li class=\"fl tc w100 list t_line lt_line\">2024-05-18</li>\n" +
                "        <li class=\"fl tc w100 list lt_line\">111</li>\n" +
                "    </ul>";
    }

    @GetMapping("/ticketdata")
    public String GetTicketData() {
        return "3 와러러 이규성 2024-05-19 222";
    }

    @PostMapping("/user")
    @ResponseBody
    public String HandleUserForm(@RequestParam("userid") String userid, @RequestParam("password") String password) {
        return "Userid : " + userid + " Password : " + password;
    }
}
