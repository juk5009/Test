package shop.mtcoding.noerror.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Board {
    private int id;
    private int userid;
    private String title;
    private Timestamp createdAt;
}
