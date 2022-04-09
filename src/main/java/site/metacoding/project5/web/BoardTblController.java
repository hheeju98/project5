package site.metacoding.project5.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.project5.domain.BoardTbl;
import site.metacoding.project5.domain.BoardTblRepository;

@RequiredArgsConstructor
@Controller
public class BoardTblController {
    private final BoardTblRepository boardTblRepository;

    @GetMapping("/list")
    public String list(Model model) {
        List<BoardTbl> boards = boardTblRepository.findAll();
        model.addAttribute("boards", boards);
        return "list";
    }
}
