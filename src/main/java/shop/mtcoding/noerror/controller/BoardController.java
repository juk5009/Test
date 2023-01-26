package shop.mtcoding.noerror.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.noerror.model.Board;
import shop.mtcoding.noerror.model.BoardRepository;
import shop.mtcoding.noerror.model.User;

@Controller
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private HttpSession session;

    @GetMapping("/board/list")
    public String detail(Model model) {
        User user = (User) session.getAttribute("principal");
        List<Board> boardList = boardRepository.findByuserId(user.getId());

        if (user == null) {
            return "notfound";
        } else {
            model.addAttribute("boardList", boardList);
            return "board/list";
        }
    }
}
