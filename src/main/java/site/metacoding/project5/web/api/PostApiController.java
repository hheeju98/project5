package site.metacoding.project5.web.api;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.project5.domain.post.Post;
import site.metacoding.project5.domain.post.PostRepository;
import site.metacoding.project5.service.PostService;
import site.metacoding.project5.web.api.dto.ResponseDto;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostService postService;
    private PostRepository postRepository;

    // 페이징
    @GetMapping("/api/post")
    public ResponseDto<?> list(@RequestParam Integer page) {
        Page<Post> posts = postService.게시글목록(page);
        return new ResponseDto<>(1, "성공", posts);
    }

    // 검색
    @GetMapping("/api/search")
    public ResponseDto<?> search(@RequestParam(defaultValue = "") String keyword) {
        List<Post> posts = postService.검색(keyword);
        return new ResponseDto<>(1, "성공", posts);
    }
}
