package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DellveryStarted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private String productname;
    private Integer qty;
}
