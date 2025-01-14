package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DellveryStarted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private String productname;
    private Integer qty;

    public DellveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DellveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
