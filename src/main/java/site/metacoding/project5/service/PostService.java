package site.metacoding.project5.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.project5.domain.post.Post;
import site.metacoding.project5.domain.post.PostRepository;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public Page<Post> 게시글목록(Integer page) {
        PageRequest pq = PageRequest.of(page, 15, Sort.by(Direction.DESC, "id"));
        System.out.println(postRepository.findAll(pq));
        return postRepository.findAll(pq);
    }

    public List<Post> 검색(String keyword) {
        List<Post> posts = postRepository.mSearch(keyword);
    }
}
