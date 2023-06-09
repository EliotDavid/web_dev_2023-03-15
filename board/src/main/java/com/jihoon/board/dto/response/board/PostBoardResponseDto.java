package com.jihoon.board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.jihoon.board.entity.BoardEntity;
import com.jihoon.board.entity.CommentEntity;
import com.jihoon.board.entity.LikyEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostBoardResponseDto {
    private BoardEntity board;
    private List<CommentEntity> commentList;
    private List<LikyEntity> likeList;

    public PostBoardResponseDto(BoardEntity board) {
        this.board = board;
        this.commentList = new ArrayList<>();
        this.likeList = new ArrayList<>();
    }
}
