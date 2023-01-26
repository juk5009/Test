package shop.mtcoding.noerror.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.noerror.model.Board;
import shop.mtcoding.noerror.model.BoardRepository;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository BoardRepository;

    @GetMapping("/board/list")
    public String list(Model model) {
        List<Board> boardList = BoardRepository.findAll();
        model.addAttribute("boardList", boardList);
        return "board/list";
    }
}
