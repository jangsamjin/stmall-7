package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderModefied extends AbstractEvent {

    private Long id;

    public OrderModefied(Order aggregate) {
        super(aggregate);
    }

    public OrderModefied() {
        super();
    }
}
//>>> DDD / Domain Event
